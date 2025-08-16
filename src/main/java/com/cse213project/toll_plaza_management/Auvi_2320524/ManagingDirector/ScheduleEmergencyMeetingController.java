package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector;

import com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model.MeetingRecord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleEmergencyMeetingController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private DatePicker meetingDatePicker;
    @FXML
    private TextField meetingTimeField;
    @FXML
    private TextField meetingPlaceField;
    @FXML
    private Button confirmMeetingButton;
    @FXML
    private Label statusLabel;
    @FXML
    private TableView<MeetingRecord> meetingTable;
    @FXML
    private TableColumn<MeetingRecord, LocalDate> meetingDateColumn;
    @FXML
    private TableColumn<MeetingRecord, String> timeColumn;
    @FXML
    private TableColumn<MeetingRecord, String> placeColumn;
    @FXML
    private TableColumn<MeetingRecord, String> statusColumn;

    private boolean loggedIn = false;
    private ArrayList<MeetingRecord> meetings = new ArrayList<>();
    private final String DATA_FILE = "meetings.bin";

    @FXML
    public void initialize() {
        meetingDateColumn.setCellValueFactory(new PropertyValueFactory<>("meetingDate"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        placeColumn.setCellValueFactory(new PropertyValueFactory<>("place"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        loadDataFromFile();
        updateTable();
    }

    @FXML
    public void handleConfirmMeeting(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            statusLabel.setText("Please enter username and password");
            return;
        }

        LocalDate meetingDate = meetingDatePicker.getValue();
        String time = meetingTimeField.getText();
        String place = meetingPlaceField.getText();

        if (meetingDate == null || time == null || time.trim().isEmpty() || place == null || place.trim().isEmpty()) {
            statusLabel.setText("Please fill all meeting details");
            return;
        }

        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Confirm Meeting");
        confirmAlert.setHeaderText("Schedule Emergency Meeting");
        confirmAlert.setContentText("Are you sure you want to schedule this meeting?");

        if (confirmAlert.showAndWait().get() == ButtonType.OK) {
            MeetingRecord newMeeting = new MeetingRecord(meetingDate, time.trim(), place.trim(), "Scheduled");
            meetings.add(newMeeting);
            saveDataToFile();
            updateTable();
            clearFields();
            statusLabel.setText("Meeting scheduled successfully!");
        }
    }

    private void clearFields() {
        meetingDatePicker.setValue(null);
        meetingTimeField.clear();
        meetingPlaceField.clear();
    }

    private void updateTable() {
        meetingTable.getItems().clear();
        meetingTable.getItems().addAll(meetings);
    }

    private void saveDataToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(meetings);
        } catch (IOException e) {
            statusLabel.setText("Error saving data: " + e.getMessage());
        }
    }

    private void loadDataFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            meetings = (ArrayList<MeetingRecord>) ois.readObject();
        } catch (FileNotFoundException e) {
            meetings = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            meetings = new ArrayList<>();
            statusLabel.setText("Error loading data: " + e.getMessage());
        }
    }

    @FXML
    public void handleLogout(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
            statusLabel.setText("Error loading login page");
        }
    }

    @FXML
    public void handleBackToMenu(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/MenuManagingDirector.fxml"));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
            statusLabel.setText("Error loading menu");
        }
    }
}
