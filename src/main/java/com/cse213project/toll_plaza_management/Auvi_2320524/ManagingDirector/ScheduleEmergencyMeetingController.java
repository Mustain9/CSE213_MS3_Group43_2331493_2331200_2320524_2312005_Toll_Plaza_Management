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
    private Button loginButton;
    @FXML
    private DatePicker meetingDatePicker;
    @FXML
    private TextField meetingTimeField;
    @FXML
    private TextField meetingPlaceField;
    @FXML
    private Button setMeetingButton;
    @FXML
    private Label statusLabel;
    @FXML
    private TableView<MeetingRecord> meetingTable;
    @FXML
    private TableColumn<MeetingRecord, LocalDate> dateColumn;
    @FXML
    private TableColumn<MeetingRecord, String> timeColumn;
    @FXML
    private TableColumn<MeetingRecord, String> placeColumn;

    private boolean loggedIn = false;
    private final ArrayList<MeetingRecord> meetings = new ArrayList<>();

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        placeColumn.setCellValueFactory(new PropertyValueFactory<>("place"));
        statusLabel.setText("");
    }

    @FXML
    public void handleLogin(ActionEvent event) {
        String u = usernameField.getText();
        String p = passwordField.getText();
        if (u == null || u.isBlank() || p == null || p.isBlank()) {
            return;
        }
        loggedIn = true;
        usernameField.setDisable(true);
        passwordField.setDisable(true);
        loginButton.setDisable(true);
    }

    @FXML
    public void handleSetMeeting(ActionEvent event) {
        if (!loggedIn) {
            statusLabel.setText("Login first");
            return;
        }
        LocalDate date = meetingDatePicker.getValue();
        String time = meetingTimeField.getText();
        String place = meetingPlaceField.getText();
        if (date == null || time == null || time.isBlank() || place == null || place.isBlank()) {
            statusLabel.setText("Enter date, time and place");
            return;
        }
        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Confirm");
        confirm.setHeaderText(null);
        confirm.setContentText("Confirm meeting details?");
        confirm.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
        ButtonType result = confirm.showAndWait().orElse(ButtonType.NO);
        if (result != ButtonType.YES) {
            return;
        }
        meetings.add(new MeetingRecord(date, time, place));
        meetingTable.getItems().setAll(meetings);
        statusLabel.setText("Meeting Scheduled Successfully");
        meetingDatePicker.setValue(null);
        meetingTimeField.clear();
        meetingPlaceField.clear();
    }

    @FXML
    public void handleLogout(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
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
        }
    }
}
