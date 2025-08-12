package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ScanTagController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnDeductToll;

    @FXML
    private TextField lblBalance;

    @FXML
    private TextField lblOwnerName;

    @FXML
    private TextField lblVehicleNumber;

    @FXML
    private TextField txtTagID;

    private double tollAmount = 50.0;

    @javafx.fxml.FXML
    public void initialize() {
        lblOwnerName.setEditable(false);
        lblVehicleNumber.setEditable(false);
        lblBalance.setEditable(false);
    }

    @FXML
    private void onScanTag() {
        String tagID = txtTagID.getText();

        if (tagID.isEmpty()) {
            showAlert("Input Error", "Please enter a Tag ID.");
            return;
        }

        if (tagID.equals("TAG123")) {
            lblOwnerName.setText("Mustain");
            lblVehicleNumber.setText("DHA-1234");
            lblBalance.setText("200.00");
        } else {
            showAlert("Not Found", "No record found for Tag ID: " + tagID);
        }
    }

    @FXML
    private void onDeductToll() {

            double Balance = Double.parseDouble(lblBalance.getText());
            if (Balance >= tollAmount) {
                double newBalance = Balance - tollAmount;
                lblBalance.setText(String.format("%.2f", newBalance));
                showAlert("Payment Successful", "Toll of " + tollAmount + " deducted successfully.");
            } else {
                showAlert("Insufficient Balance", "Not enough funds to deduct toll.");
            }
    }

    @FXML
    private void onCancel() {
        txtTagID.clear();
        lblOwnerName.clear();
        lblVehicleNumber.clear();
        lblBalance.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/TollCollector/toll_collector_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
