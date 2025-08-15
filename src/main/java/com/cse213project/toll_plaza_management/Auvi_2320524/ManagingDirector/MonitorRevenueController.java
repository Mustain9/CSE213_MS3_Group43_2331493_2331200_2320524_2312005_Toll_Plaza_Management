package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector;

import com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model.RevenueRow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    private Button loginButton;
    @FXML
    private RadioButton dailyRadio;
    @FXML
    private RadioButton monthlyRadio;
    @FXML
    private DatePicker fromDatePicker;
    @FXML
    private DatePicker toDatePicker;
    @FXML
    private LineChart<String, Number> revenueChart;
    @FXML
    private TableView<RevenueRow> revenueTable;
    @FXML
    private TableColumn<RevenueRow, String> dateColumn;
    @FXML
    private TableColumn<RevenueRow, Double> incomeColumn;
    @FXML
    private TableColumn<RevenueRow, Double> expenseColumn;
    @FXML
    private TableColumn<RevenueRow, Double> balanceColumn;
    @FXML
    private TextArea analysisArea;

    private boolean loggedIn = false;
    private final ArrayList<RevenueRow> rows = new ArrayList<>();

    @FXML
    public void initialize() {
        ToggleGroup group = new ToggleGroup();
        dailyRadio.setToggleGroup(group);
        monthlyRadio.setToggleGroup(group);
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("dateLabel"));
        incomeColumn.setCellValueFactory(new PropertyValueFactory<>("totalIncome"));
        expenseColumn.setCellValueFactory(new PropertyValueFactory<>("totalExpense"));
        balanceColumn.setCellValueFactory(new PropertyValueFactory<>("balance"));
        analysisArea.setText("");
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
    public void selectDaily(ActionEvent event) {
        dailyRadio.setSelected(true);
        monthlyRadio.setSelected(false);
    }

    @FXML
    public void selectMonthly(ActionEvent event) {
        dailyRadio.setSelected(false);
        monthlyRadio.setSelected(true);
    }

    @FXML
    public void handleGenerate(ActionEvent event) {
        if (!loggedIn) {
            return;
        }
        LocalDate from = fromDatePicker.getValue();
        LocalDate to = toDatePicker.getValue();
        if (from == null || to == null || to.isBefore(from)) {
            return;
        }
        rows.clear();
        LocalDate d = from;
        while (!d.isAfter(to)) {
            double income = Math.round((10000 + Math.random() * 5000) * 100.0) / 100.0;
            double expense = Math.round((4000 + Math.random() * 3000) * 100.0) / 100.0;
            double balance = Math.round((income - expense) * 100.0) / 100.0;
            String label = dailyRadio.isSelected() ? d.toString() : d.getYear() + "-" + String.format("%02d", d.getMonthValue());
            rows.add(new RevenueRow(label, income, expense, balance));
            d = dailyRadio.isSelected() ? d.plusDays(1) : d.plusMonths(1);
        }
        revenueTable.getItems().setAll(rows);
        updateChart();
        updateAnalysis();
    }

    private void updateChart() {
        XYChart.Series<String, Number> incomeSeries = new XYChart.Series<>();
        incomeSeries.setName("Income");
        XYChart.Series<String, Number> expenseSeries = new XYChart.Series<>();
        expenseSeries.setName("Expense");
        for (RevenueRow r : rows) {
            incomeSeries.getData().add(new XYChart.Data<>(r.getDateLabel(), r.getTotalIncome()));
            expenseSeries.getData().add(new XYChart.Data<>(r.getDateLabel(), r.getTotalExpense()));
        }
        revenueChart.getData().setAll(incomeSeries, expenseSeries);
    }

    private void updateAnalysis() {
        double totalIncome = rows.stream().mapToDouble(RevenueRow::getTotalIncome).sum();
        double totalExpense = rows.stream().mapToDouble(RevenueRow::getTotalExpense).sum();
        double balance = totalIncome - totalExpense;
        String text = "Total Income: " + String.format("%.2f", totalIncome) + "\n" +
                "Total Expense: " + String.format("%.2f", totalExpense) + "\n" +
                "Balance: " + String.format("%.2f", balance);
        analysisArea.setText(text);
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
