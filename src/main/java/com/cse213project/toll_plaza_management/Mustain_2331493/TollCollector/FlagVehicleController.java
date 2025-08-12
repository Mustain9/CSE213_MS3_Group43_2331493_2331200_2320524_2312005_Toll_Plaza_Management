package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FlagVehicleController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSubmitFlag;

    @FXML
    private TextArea txtReason;

    @FXML
    private TextField txtVehicleNumber;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    private void onSubmitFlag() {
        String vehicleNumber = txtVehicleNumber.getText();
        String reason = txtReason.getText();

        if (vehicleNumber.isEmpty() || reason.isEmpty()) {
            showAlert("Input Error", "Please fill in both Vehicle Number and Reason.");
            return;
        }

        showAlert("Success", "Vehicle " + vehicleNumber + " has been flagged for: " + reason);

        clearFields();
    }

    @FXML
    private void onCancel() {
        clearFields();
    }

    private void clearFields() {
        txtVehicleNumber.clear();
        txtReason.clear();
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
