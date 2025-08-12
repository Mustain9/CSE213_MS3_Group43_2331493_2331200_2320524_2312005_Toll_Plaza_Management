package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ReportIssueController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSubmitIssue;

    @FXML
    private ComboBox<String> comboIssueType;

    @FXML
    private TextArea txtDescription;

    @javafx.fxml.FXML
    public void initialize() {
        comboIssueType.getItems().addAll("System Error", "Payment Failure", "Tag Malfunction", "Incorrect Toll Amount", "Other");
    }

    @FXML
    public void OnSubmit(ActionEvent actionEvent) {
        String Description = txtDescription.getText();
        String IssueType = comboIssueType.getValue();

        if (Description.isEmpty() || IssueType == null) {
            showAlert("Input Error", "Please select an issue type and provide a description.");
            return;
        }


        showAlert("Success", "Issue reported successfully!\nType: " + IssueType + "\nDetails: " + Description);

        clearFields();
    }

    @FXML
    public void OnCancel(ActionEvent actionEvent) {
        clearFields();
    }


    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/TollCollector/toll_collector_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void clearFields() {
        txtDescription.clear();
        comboIssueType.setValue(null);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }





}
