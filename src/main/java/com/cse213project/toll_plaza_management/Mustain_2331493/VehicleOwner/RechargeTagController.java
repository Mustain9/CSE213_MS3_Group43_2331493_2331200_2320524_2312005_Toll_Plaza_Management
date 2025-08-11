package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

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

public class RechargeTagController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnRecharge;

    @FXML
    private TextField txtRechargeAmount;

    @FXML
    private TextField txtTagID;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void btnRechargeAction(ActionEvent event) {
        String tagID = txtTagID.getText().trim();
        String rechargeAmountText = txtRechargeAmount.getText().trim();

        if (tagID.isEmpty() || rechargeAmountText.isEmpty()) {
            showAlert("Input Error", "All fields are required.");
            return;
        }

        double rechargeAmount;
        try {
            rechargeAmount = Double.parseDouble(rechargeAmountText);
            if (rechargeAmount <= 0) {
                showAlert("Invalid Amount", "Recharge amount must be greater than 0.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Recharge amount must be a valid number.");
            return;
        }

        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setTitle("Recharge Successful");
        success.setHeaderText(null);
        success.setContentText("Tag " + tagID + " has been recharged with " +
                rechargeAmount + " BDT.");
        success.showAndWait();

        clearFields();
    }

    @FXML
    public void btnCancelAction(ActionEvent actionEvent) {
        clearFields();
    }

    private void clearFields() {
        txtTagID.clear();
        txtRechargeAmount.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
