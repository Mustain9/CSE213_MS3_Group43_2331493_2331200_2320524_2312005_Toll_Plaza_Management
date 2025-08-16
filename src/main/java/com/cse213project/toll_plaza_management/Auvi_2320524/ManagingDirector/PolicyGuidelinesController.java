package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector;

import com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model.PolicyRecord;
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

public class PolicyGuidelinesController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField policyTitleField;
    @FXML
    private TextArea policyDescriptionArea;
    @FXML
    private DatePicker effectiveDatePicker;
    @FXML
    private Button applyPolicyButton;
    @FXML
    private Label statusLabel;
    @FXML
    private TableView<PolicyRecord> policyTable;
    @FXML
    private TableColumn<PolicyRecord, String> titleColumn;
    @FXML
    private TableColumn<PolicyRecord, String> descriptionColumn;
    @FXML
    private TableColumn<PolicyRecord, LocalDate> dateColumn;
    @FXML
    private TableColumn<PolicyRecord, String> statusColumn;

    private ArrayList<PolicyRecord> policies = new ArrayList<>();
    private final String DATA_FILE = "policies.bin";

    @FXML
    public void initialize() {
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("policyTitle"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("effectiveDate"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        loadDataFromFile();
        updateTable();
    }

    @FXML
    public void handleApplyPolicy(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            statusLabel.setText("Please enter username and password");
            return;
        }

        String policyTitle = policyTitleField.getText();
        String description = policyDescriptionArea.getText();
        LocalDate effectiveDate = effectiveDatePicker.getValue();

        if (policyTitle == null || policyTitle.trim().isEmpty() ||
                description == null || description.trim().isEmpty() ||
                effectiveDate == null) {
            statusLabel.setText("Please fill all policy details");
            return;
        }

        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Apply Policy");
        confirmAlert.setHeaderText("Add Policy & Guidelines");
        confirmAlert.setContentText("Are you sure you want to apply this policy?");

        if (confirmAlert.showAndWait().get() == ButtonType.OK) {
            PolicyRecord newPolicy = new PolicyRecord(
                    policyTitle.trim(),
                    description.trim(),
                    effectiveDate,
                    "Active"
            );
            policies.add(newPolicy);
            saveDataToFile();
            updateTable();
            clearFields();
            statusLabel.setText("Policy applied successfully!");
        }
    }

    private void clearFields() {
        policyTitleField.clear();
        policyDescriptionArea.clear();
        effectiveDatePicker.setValue(null);
    }

    private void updateTable() {
        policyTable.getItems().clear();
        policyTable.getItems().addAll(policies);
    }

    private void saveDataToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(policies);
        } catch (IOException e) {
            statusLabel.setText("Error saving data: " + e.getMessage());
        }
    }

    private void loadDataFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            policies = (ArrayList<PolicyRecord>) ois.readObject();
        } catch (FileNotFoundException e) {
            policies = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            policies = new ArrayList<>();
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
