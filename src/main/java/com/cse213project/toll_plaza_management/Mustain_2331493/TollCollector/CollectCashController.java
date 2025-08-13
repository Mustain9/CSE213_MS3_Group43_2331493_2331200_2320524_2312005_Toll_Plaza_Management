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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CollectCashController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnConfirmCashPayment;

    @FXML
    private ComboBox<String> comboVehicleType;

    @FXML
    private TextField lblTollAmount;

    @FXML
    private TextField txtVehicleNumber;

    public void initialize() {
        comboVehicleType.getItems().addAll("Car", "Truck", "Bus", "Motorbike");}

    @FXML
    private void handleConfirmCashPayment() {
        String vehicleNumber = txtVehicleNumber.getText();
        String tollAmount = lblTollAmount.getText();


        if (vehicleNumber.isEmpty() || comboVehicleType.getValue() == null || tollAmount.isEmpty()) {
            showAlert("Input Error", "Please fill all required fields.");
            return;
        }


        showAlert("Success", "Cash payment recorded for vehicle: " + vehicleNumber);
        clearFields();

    }

    @FXML
    private void handleCancel() {
        clearFields();
    }

    private void clearFields() {
        txtVehicleNumber.clear();
        comboVehicleType.setValue(null);
        lblTollAmount.clear();
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
