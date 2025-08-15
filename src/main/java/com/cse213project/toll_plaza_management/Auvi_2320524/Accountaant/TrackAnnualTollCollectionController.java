package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant;

import com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model.AnnualSummaryRow;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;

public class TrackAnnualTollCollectionController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private ComboBox<String> optionCombo;
    @FXML
    private ComboBox<String> updateTypeCombo;
    @FXML
    private DatePicker yearPicker;
    @FXML
    private TableView<AnnualSummaryRow> annualTable;
    @FXML
    private TableColumn<AnnualSummaryRow, String> colMonth;
    @FXML
    private TableColumn<AnnualSummaryRow, Double> colTotalIncome;
    @FXML
    private TableColumn<AnnualSummaryRow, Double> colTotalExpense;
    @FXML
    private TableColumn<AnnualSummaryRow, Double> colNetCollection;

    private final ArrayList<AnnualSummaryRow> rows = new ArrayList<>();

    @FXML
    public void initialize() {
        colMonth.setCellValueFactory(new PropertyValueFactory<>("month"));
        colTotalIncome.setCellValueFactory(new PropertyValueFactory<>("totalIncome"));
        colTotalExpense.setCellValueFactory(new PropertyValueFactory<>("totalExpense"));
        colNetCollection.setCellValueFactory(new PropertyValueFactory<>("netCollection"));
        optionCombo.getItems().setAll("Income", "Expense");
        updateTypeCombo.getItems().setAll("Daily", "Monthly", "Annually");
    }

    @FXML
    private void onLogin() {
        String u = usernameField.getText();
        String p = passwordField.getText();
        if (u == null || u.isBlank() || p == null || p.isBlank()) {
            show("Login", "Enter username and password");
            return;
        }
        show("Login", "Login successful");
    }

    @FXML
    private void onIncomeRecords() {
        optionCombo.getSelectionModel().select("Income");
    }

    @FXML
    private void onExpenseRecords() {
        optionCombo.getSelectionModel().select("Expense");
    }

    @FXML
    private void onFinancialUpdates() {
        updateTypeCombo.getSelectionModel().select("Annually");
    }

    @FXML
    private void onSelectOption() {
    }

    @FXML
    private void onSelectUpdateType() {
    }

    @FXML
    private void onSelectYear() {
    }

    @FXML
    private void onViewAnnualSummary() {
        LocalDate date = yearPicker == null ? null : yearPicker.getValue();
        int year = date != null ? date.getYear() : LocalDate.now().getYear();
        rows.clear();
        for (int i = 1; i <= 12; i++) {
            Month m = Month.of(i);
            String name = m.getDisplayName(TextStyle.FULL, Locale.getDefault());
            double income = Math.round((50000 + Math.random() * 50000) * 100.0) / 100.0;
            double expense = Math.round((20000 + Math.random() * 30000) * 100.0) / 100.0;
            double net = Math.round((income - expense) * 100.0) / 100.0;
            rows.add(new AnnualSummaryRow(year + " - " + name, income, expense, net));
        }
        annualTable.getItems().setAll(rows);
    }

    @FXML
    private void onLogout() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
            javafx.stage.Stage stage = (javafx.stage.Stage) annualTable.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
        }
    }

    @FXML
    private void onBackToMenu() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/MenuAccountant.fxml"));
            Stage stage = (Stage) annualTable.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
        }
    }

    private void show(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}