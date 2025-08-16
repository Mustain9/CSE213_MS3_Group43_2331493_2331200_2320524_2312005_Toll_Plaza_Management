package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector;

import com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model.RevenueRow;
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

public class MonitorRevenueController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ComboBox<String> reportTypeComboBox;
    @FXML
    private DatePicker fromDatePicker;
    @FXML
    private DatePicker toDatePicker;
    @FXML
    private Button generateReportButton;
    @FXML
    private Label statusLabel;
    @FXML
    private TableView<RevenueRow> revenueTable;
    @FXML
    private TableColumn<RevenueRow, String> reportTypeColumn;
    @FXML
    private TableColumn<RevenueRow, LocalDate> fromDateColumn;
    @FXML
    private TableColumn<RevenueRow, LocalDate> toDateColumn;
    @FXML
    private TableColumn<RevenueRow, Double> revenueAmountColumn;

    private ArrayList<RevenueRow> revenueReports = new ArrayList<>();
    private final String DATA_FILE = "revenue_reports.bin";

    @FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Daily", "Monthly");

        reportTypeColumn.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        fromDateColumn.setCellValueFactory(new PropertyValueFactory<>("fromDate"));
        toDateColumn.setCellValueFactory(new PropertyValueFactory<>("toDate"));
        revenueAmountColumn.setCellValueFactory(new PropertyValueFactory<>("revenueAmount"));

        loadDataFromFile();
        updateTable();
    }

    @FXML
    public void handleGenerateReport(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            statusLabel.setText("Please enter username and password");
            return;
        }

        String reportType = reportTypeComboBox.getValue();
        LocalDate fromDate = fromDatePicker.getValue();
        LocalDate toDate = toDatePicker.getValue();

        if (reportType == null || fromDate == null || toDate == null) {
            statusLabel.setText("Please select report type and date range");
            return;
        }

        if (toDate.isBefore(fromDate)) {
            statusLabel.setText("To Date cannot be before From Date");
            return;
        }

        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Generate Report");
        confirmAlert.setHeaderText("Monitor Daily/Monthly Toll Revenue");
        confirmAlert.setContentText("Generate revenue report for " + reportType + " from " + fromDate + " to " + toDate + "?");

        if (confirmAlert.showAndWait().get() == ButtonType.OK) {
            Double calculatedRevenue = calculateRevenue(reportType, fromDate, toDate);

            RevenueRow newReport = new RevenueRow(reportType, fromDate, toDate, calculatedRevenue);
            revenueReports.add(newReport);
            saveDataToFile();
            updateTable();
            clearFields();
            statusLabel.setText("Report generated successfully! Revenue: $" + String.format("%.2f", calculatedRevenue));
        }
    }

    private Double calculateRevenue(String reportType, LocalDate fromDate, LocalDate toDate) {
        long daysDifference = toDate.toEpochDay() - fromDate.toEpochDay() + 1;
        double baseRevenue = reportType.equals("Daily") ? 5000.0 : 150000.0;
        double multiplier = reportType.equals("Daily") ? daysDifference : (daysDifference / 30.0);
        return Math.round((baseRevenue * multiplier + (Math.random() * 10000)) * 100.0) / 100.0;
    }

    private void clearFields() {
        reportTypeComboBox.setValue(null);
        fromDatePicker.setValue(null);
        toDatePicker.setValue(null);
    }

    private void updateTable() {
        revenueTable.getItems().clear();
        revenueTable.getItems().addAll(revenueReports);
    }

    private void saveDataToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(revenueReports);
        } catch (IOException e) {
            statusLabel.setText("Error saving data: " + e.getMessage());
        }
    }

    private void loadDataFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            revenueReports = (ArrayList<RevenueRow>) ois.readObject();
        } catch (FileNotFoundException e) {
            revenueReports = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            revenueReports = new ArrayList<>();
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
