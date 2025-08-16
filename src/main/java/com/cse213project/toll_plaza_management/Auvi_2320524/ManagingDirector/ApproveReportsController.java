package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector;

import com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model.ReportRow;
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

public class ApproveReportsController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ComboBox<String> reportIdComboBox;
    @FXML
    private RadioButton approveRadio;
    @FXML
    private RadioButton rejectRadio;
    @FXML
    private DatePicker decisionDatePicker;
    @FXML
    private Button submitDecisionButton;
    @FXML
    private Label statusLabel;
    @FXML
    private TableView<ReportRow> reportsTable;
    @FXML
    private TableColumn<ReportRow, String> reportIdColumn;
    @FXML
    private TableColumn<ReportRow, String> decisionColumn;
    @FXML
    private TableColumn<ReportRow, LocalDate> decisionDateColumn;
    @FXML
    private TableColumn<ReportRow, String> statusColumn;

    private ArrayList<ReportRow> reportDecisions = new ArrayList<>();
    private final String DATA_FILE = "report_decisions.bin";

    @FXML
    public void initialize() {
        reportIdComboBox.getItems().addAll("RPT001", "RPT002", "RPT003", "RPT004", "RPT005", "RPT006", "RPT007", "RPT008");

        ToggleGroup decisionGroup = new ToggleGroup();
        approveRadio.setToggleGroup(decisionGroup);
        rejectRadio.setToggleGroup(decisionGroup);

        reportIdColumn.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        decisionColumn.setCellValueFactory(new PropertyValueFactory<>("decision"));
        decisionDateColumn.setCellValueFactory(new PropertyValueFactory<>("decisionDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadDataFromFile();
        updateTable();
    }

    @FXML
    public void handleSubmitDecision(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            statusLabel.setText("Please enter username and password");
            return;
        }

        String reportId = reportIdComboBox.getValue();
        String decision = approveRadio.isSelected() ? "Approve" : (rejectRadio.isSelected() ? "Reject" : null);
        LocalDate decisionDate = decisionDatePicker.getValue();

        if (reportId == null || decision == null || decisionDate == null) {
            statusLabel.setText("Please select report ID, decision, and decision date");
            return;
        }

        for (ReportRow existingReport : reportDecisions) {
            if (existingReport.getReportId().equals(reportId)) {
                statusLabel.setText("Decision already submitted for this report");
                return;
            }
        }

        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Submit Decision");
        confirmAlert.setHeaderText("Approve Financial & Operational Reports");
        confirmAlert.setContentText("Submit " + decision + " decision for Report " + reportId + "?");

        if (confirmAlert.showAndWait().get() == ButtonType.OK) {
            String status = decision.equals("Approve") ? "Approved" : "Rejected";
            ReportRow newReportDecision = new ReportRow(reportId, decision, decisionDate, status);
            reportDecisions.add(newReportDecision);
            saveDataToFile();
            updateTable();
            clearFields();
            statusLabel.setText("Decision submitted successfully for Report " + reportId);
        }
    }

    private void clearFields() {
        reportIdComboBox.setValue(null);
        approveRadio.setSelected(false);
        rejectRadio.setSelected(false);
        decisionDatePicker.setValue(null);
    }

    private void updateTable() {
        reportsTable.getItems().clear();
        reportsTable.getItems().addAll(reportDecisions);
    }

    private void saveDataToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(reportDecisions);
        } catch (IOException e) {
            statusLabel.setText("Error saving data: " + e.getMessage());
        }
    }

    private void loadDataFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            reportDecisions = (ArrayList<ReportRow>) ois.readObject();
        } catch (FileNotFoundException e) {
            reportDecisions = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            reportDecisions = new ArrayList<>();
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
