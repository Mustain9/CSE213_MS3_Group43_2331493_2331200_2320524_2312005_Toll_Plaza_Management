package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant;

import com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model.ExpenseRecord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.time.LocalDate;

public class RecordMaintenanceExpenseController {
    @FXML
    private javafx.scene.layout.AnchorPane rootPane;
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
    private Button addExpenseButton;
    @FXML
    private VBox formContainer;
    @FXML
    private DatePicker expenseDatePicker;
    @FXML
    private ComboBox<String> expenseTypeCombo;
    @FXML
    private TextField descriptionField;
    @FXML
    private TextField amountField;
    @FXML
    private Button uploadInvoiceButton;
    @FXML
    private Label invoiceNameLabel;
    @FXML
    private Button submitExpenseButton;
    @FXML
    private Label validationStatusLabel;
    @FXML
    private Label savedLabel;
    @FXML
    private Button backButton;

    private boolean loggedIn = false;
    private File selectedInvoiceFile = null;

    @FXML
    public void initialize() {
        formContainer.setDisable(true);
        validationStatusLabel.setText("");
        savedLabel.setVisible(false);
        savedLabel.setManaged(false);
        expenseTypeCombo.getItems().setAll("Maintenance", "Repair", "Utilities", "Other");
        expenseTypeCombo.getSelectionModel().select("Maintenance");
    }

    @FXML
    public void handleLogin(ActionEvent event) {
        String u = usernameField.getText();
        String p = passwordField.getText();
        if (u == null || u.isBlank() || p == null || p.isBlank()) {
            validationStatusLabel.setText("Enter username and password");
            return;
        }
        loggedIn = true;
        usernameField.setDisable(true);
        passwordField.setDisable(true);
        loginButton.setDisable(true);
        validationStatusLabel.setText("");
    }

    @FXML
    public void handleIncome(ActionEvent event) {
        validationStatusLabel.setText("Income selected");
    }

    @FXML
    public void handleExpense(ActionEvent event) {
        validationStatusLabel.setText("Expense selected");
    }

    @FXML
    public void handleAddExpense(ActionEvent event) {
        if (!loggedIn) {
            validationStatusLabel.setText("Login first");
            return;
        }
        formContainer.setDisable(false);
        validationStatusLabel.setText("");
    }

    @FXML
    public void handleUploadInvoice(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Select Invoice");
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF or Image", "*.pdf", "*.png", "*.jpg", "*.jpeg"));
        Stage stage = (Stage) rootPane.getScene().getWindow();
        File f = chooser.showOpenDialog(stage);
        selectedInvoiceFile = f;
        if (f == null) {
            invoiceNameLabel.setText("No file selected");
        } else {
            invoiceNameLabel.setText(f.getName());
        }
    }

    @FXML
    public void handleSubmitExpense(ActionEvent event) {
        if (!loggedIn) {
            validationStatusLabel.setText("Login first");
            return;
        }
        LocalDate date = expenseDatePicker.getValue();
        String type = expenseTypeCombo.getValue();
        String desc = descriptionField.getText();
        String amtText = amountField.getText();
        Double amount;
        if (date == null) {
            validationStatusLabel.setText("Select expense date");
            savedLabel.setVisible(false);
            savedLabel.setManaged(false);
            return;
        }
        if (type == null || type.isBlank()) {
            validationStatusLabel.setText("Select expense type");
            savedLabel.setVisible(false);
            savedLabel.setManaged(false);
            return;
        }
        if (desc == null || desc.isBlank()) {
            validationStatusLabel.setText("Enter description");
            savedLabel.setVisible(false);
            savedLabel.setManaged(false);
            return;
        }
        try {
            amount = Double.parseDouble(amtText);
        } catch (Exception e) {
            validationStatusLabel.setText("Enter valid amount");
            savedLabel.setVisible(false);
            savedLabel.setManaged(false);
            return;
        }
        if (amount <= 0) {
            validationStatusLabel.setText("Amount must be positive");
            savedLabel.setVisible(false);
            savedLabel.setManaged(false);
            return;
        }
        String invoicePath = selectedInvoiceFile == null ? "" : selectedInvoiceFile.getAbsolutePath();
        ExpenseRecord record = new ExpenseRecord(date, type, desc, amount, invoicePath);
        validationStatusLabel.setText("Validated");
        savedLabel.setVisible(true);
        savedLabel.setManaged(true);
        clearForm();
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

    private void clearForm() {
        expenseDatePicker.setValue(null);
        expenseTypeCombo.getSelectionModel().select("Maintenance");
        descriptionField.clear();
        amountField.clear();
        selectedInvoiceFile = null;
        invoiceNameLabel.setText("No file selected");
    }
}
