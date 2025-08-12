package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class IssueTemporaryTagController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnIssueTag;

    @FXML
    private DatePicker dateExpiry;

    @FXML
    private TextField txtTempTagID;

    @FXML
    private TextField txtVehicleNumber;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    private void onIssueTag() {
        String tempTagID = txtTempTagID.getText();
        String vehicleNumber = txtVehicleNumber.getText();
        LocalDate expiryDate = dateExpiry.getValue();

        if (tempTagID.isEmpty() || vehicleNumber.isEmpty() || expiryDate == null) {
            showAlert("Input Error", "Please fill in all fields.");
            return;
        }

        if (expiryDate.isBefore(LocalDate.now())) {
            showAlert("Invalid Date", "Expiry date must be in the future.");
            return;
        }

        showAlert("Success", "Temporary Tag " + tempTagID + " issued for vehicle " + vehicleNumber +
                " until " + expiryDate);

        clearFields();
    }

    @FXML
    private void onCancel() {
        clearFields();
    }

    private void clearFields() {
        txtTempTagID.clear();
        txtVehicleNumber.clear();
        dateExpiry.setValue(null);
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
