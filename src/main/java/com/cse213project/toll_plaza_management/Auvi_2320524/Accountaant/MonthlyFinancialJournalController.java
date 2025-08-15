package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant;

import com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model.MonthlyJournalEntry;
import javafx.collections.FXCollections;
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
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class MonthlyFinancialJournalController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button btnFinancialReport;
    @FXML
    private Button btnIncomeExpense;
    @FXML
    private Button btnSettings;
    @FXML
    private ComboBox<String> reportTypeCombo;
    @FXML
    private Button createJournalButton;
    @FXML
    private DatePicker monthPicker;
    @FXML
    private Button generateButton;
    @FXML
    private TableView<MonthlyJournalEntry> journalTable;
    @FXML
    private TableColumn<MonthlyJournalEntry, LocalDate> dateColumn;
    @FXML
    private TableColumn<MonthlyJournalEntry, String> descriptionColumn;
    @FXML
    private TableColumn<MonthlyJournalEntry, Double> debitColumn;
    @FXML
    private TableColumn<MonthlyJournalEntry, Double> creditColumn;
    @FXML
    private TableColumn<MonthlyJournalEntry, Double> balanceColumn;
    @FXML
    private Button logoutButton;
    @FXML
    private Button backButton;

    private final ArrayList<MonthlyJournalEntry> entries = new ArrayList<>();
    private YearMonth selectedYearMonth;

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        debitColumn.setCellValueFactory(new PropertyValueFactory<>("debit"));
        creditColumn.setCellValueFactory(new PropertyValueFactory<>("credit"));
        balanceColumn.setCellValueFactory(new PropertyValueFactory<>("balance"));
        reportTypeCombo.getItems().setAll("Financial Report", "Audit", "Summary");
    }

    @FXML
    public void handleLogin(ActionEvent event) {
        String u = usernameField.getText();
        String p = passwordField.getText();
        if (u == null || u.isBlank() || p == null || p.isBlank()) {
            return;
        }
        usernameField.setDisable(true);
        passwordField.setDisable(true);
        loginButton.setDisable(true);
    }

    @FXML
    public void handleFinancialReport(ActionEvent event) {
        reportTypeCombo.setValue("Financial Report");
    }

    @FXML
    public void handleIncomeExpense(ActionEvent event) {
        reportTypeCombo.setValue("Summary");
    }

    @FXML
    public void handleSettings(ActionEvent event) {
    }

    @FXML
    public void handleReportTypeChange(ActionEvent event) {
    }

    @FXML
    public void handleCreateNewJournal(ActionEvent event) {
        entries.clear();
        refreshTable();
    }

    @FXML
    public void handleMonthPicked(ActionEvent event) {
        LocalDate picked = monthPicker.getValue();
        if (picked == null) {
            selectedYearMonth = null;
        } else {
            selectedYearMonth = YearMonth.from(picked);
        }
    }

    @FXML
    public void handleGenerateJournal(ActionEvent event) {
        if (selectedYearMonth == null) {
            LocalDate d = monthPicker.getValue();
            if (d != null) {
                selectedYearMonth = YearMonth.from(d);
            }
        }
        if (selectedYearMonth == null) {
            return;
        }
        entries.clear();
        List<LocalDate> dates = sampleDates(selectedYearMonth);
        double running = 0.0;
        for (int i = 0; i < dates.size(); i++) {
            LocalDate d = dates.get(i);
            boolean isDebit = i % 2 == 0;
            double amount = 1000.0 + (i * 250.0);
            double debit = isDebit ? amount : 0.0;
            double credit = isDebit ? 0.0 : amount * 0.8;
            running = running + debit - credit;
            MonthlyJournalEntry e = new MonthlyJournalEntry(d, isDebit ? "Received Payment" : "Paid Expense", debit, credit, running);
            entries.add(e);
        }
        refreshTable();
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
            Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/MenuAccountant.fxml"));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
        }
    }

    private void refreshTable() {
        journalTable.setItems(FXCollections.observableList(new ArrayList<>(entries)));
    }

    private List<LocalDate> sampleDates(YearMonth ym) {
        ArrayList<LocalDate> list = new ArrayList<>();
        int lastDay = ym.lengthOfMonth();
        int[] days = new int[]{1, 7, 14, 21, 28};
        for (int d : days) {
            int day = Math.min(d, lastDay);
            list.add(LocalDate.of(ym.getYear(), ym.getMonth(), day));
        }
        return list;
    }
}
