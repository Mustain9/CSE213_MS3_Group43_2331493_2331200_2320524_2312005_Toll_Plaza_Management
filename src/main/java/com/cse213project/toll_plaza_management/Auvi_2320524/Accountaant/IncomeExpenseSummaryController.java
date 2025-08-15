package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant;

import com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model.SummaryRecord;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IncomeExpenseSummaryController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Button incomeButton;
    @FXML
    private Button expenseButton;
    @FXML
    private Button viewSummaryButton;
    @FXML
    private VBox dateRangeBox;
    @FXML
    private DatePicker fromDatePicker;
    @FXML
    private DatePicker toDatePicker;
    @FXML
    private Button applyButton;
    @FXML
    private Label totalIncomeLabel;
    @FXML
    private Label totalExpenseLabel;
    @FXML
    private Label balanceLabel;
    @FXML
    private HBox contentBox;
    @FXML
    private TableView<SummaryRecord> summaryTable;
    @FXML
    private TableColumn<SummaryRecord, LocalDate> dateColumn;
    @FXML
    private TableColumn<SummaryRecord, String> typeColumn;
    @FXML
    private TableColumn<SummaryRecord, Double> amountColumn;
    @FXML
    private TableColumn<SummaryRecord, String> descriptionColumn;
    @FXML
    private PieChart summaryChart;
    @FXML
    private Button submitDataButton;
    @FXML
    private Button logoutButton;

    private boolean loggedIn = false;
    private String selectedSection = "All";
    private final ArrayList<SummaryRecord> allRecords = new ArrayList<>();

    @FXML
    public void initialize() {
        dateRangeBox.setDisable(true);
        contentBox.setDisable(true);
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        updateTotalsAndChart(new ArrayList<>());
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
    public void handleIncome(ActionEvent event) {
        selectedSection = "Income";
    }

    @FXML
    public void handleExpense(ActionEvent event) {
        selectedSection = "Expense";
    }

    @FXML
    public void handleViewSummary(ActionEvent event) {
        if (!loggedIn) {
            return;
        }
        dateRangeBox.setDisable(false);
        contentBox.setDisable(false);
    }

    @FXML
    public void handleApply(ActionEvent event) {
        List<SummaryRecord> filtered = filterByDateRange(allRecords);
        refreshTable(filtered);
        updateTotalsAndChart(new ArrayList<>(filtered));
    }

    @FXML
    public void handleSubmitData(ActionEvent event) {
        LocalDate from = fromDatePicker.getValue();
        LocalDate to = toDatePicker.getValue();
        if (from == null || to == null || to.isBefore(from)) {
            LocalDate today = LocalDate.now();
            to = today;
            from = today.minusDays(6);
            fromDatePicker.setValue(from);
            toDatePicker.setValue(to);
        }
        allRecords.clear();
        ArrayList<SummaryRecord> generated = generateSampleData(from, to, selectedSection);
        allRecords.addAll(generated);
        List<SummaryRecord> filtered = filterByDateRange(allRecords);
        refreshTable(filtered);
        updateTotalsAndChart(new ArrayList<>(filtered));
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

    private void refreshTable(List<SummaryRecord> list) {
        summaryTable.setItems(FXCollections.observableList(new ArrayList<>(list)));
    }

    private void updateTotalsAndChart(ArrayList<SummaryRecord> list) {
        double income = list.stream().filter(r -> "Income".equalsIgnoreCase(r.getType())).mapToDouble(SummaryRecord::getAmount).sum();
        double expense = list.stream().filter(r -> "Expense".equalsIgnoreCase(r.getType())).mapToDouble(SummaryRecord::getAmount).sum();
        double balance = income - expense;
        totalIncomeLabel.setText("Total Income: " + String.format("%.2f", income));
        totalExpenseLabel.setText("Total Expense: " + String.format("%.2f", expense));
        balanceLabel.setText("Balance: " + String.format("%.2f", balance));
        ArrayList<PieChart.Data> data = new ArrayList<>();
        data.add(new PieChart.Data("Income", income));
        data.add(new PieChart.Data("Expense", expense));
        summaryChart.setData(FXCollections.observableList(data));
    }

    private List<SummaryRecord> filterByDateRange(List<SummaryRecord> src) {
        LocalDate from = fromDatePicker.getValue();
        LocalDate to = toDatePicker.getValue();
        return src.stream().filter(r -> {
            LocalDate d = r.getDate();
            boolean afterFrom = from == null || !d.isBefore(from);
            boolean beforeTo = to == null || !d.isAfter(to);
            return afterFrom && beforeTo;
        }).collect(Collectors.toList());
    }

    private ArrayList<SummaryRecord> generateSampleData(LocalDate from, LocalDate to, String section) {
        ArrayList<SummaryRecord> list = new ArrayList<>();
        LocalDate d = from;
        int i = 0;
        while (!d.isAfter(to)) {
            boolean incomeDay = i % 2 == 0;
            if ("Income".equals(section)) {
                incomeDay = true;
            } else if ("Expense".equals(section)) {
                incomeDay = false;
            }
            if (incomeDay) {
                list.add(new SummaryRecord(d, "Income", 1000.0 + (i * 150.0), "Toll collections"));
            } else {
                list.add(new SummaryRecord(d, "Expense", 600.0 + (i * 120.0), "Maintenance cost"));
            }
            d = d.plusDays(1);
            i++;
        }
        return list;
    }
}