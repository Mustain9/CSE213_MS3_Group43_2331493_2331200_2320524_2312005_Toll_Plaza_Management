package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PayTollOnlineController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnPayToll;

    @FXML
    private ComboBox<String> comboPaymentMethod;

    @FXML
    private TextField txtTollAmount;

    @FXML
    private TextField txtVehicleNumber;

    public static ObservableList<Invoice> invoiceList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        comboPaymentMethod.getItems().addAll("Credit Card","Bkash", "PayPal","Upay","Nogod");
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void btnPayToll(ActionEvent actionEvent) {
        String vehicleNumber = txtVehicleNumber.getText();
        String tollAmountStr = txtTollAmount.getText();
        String paymentMethod = comboPaymentMethod.getValue();

        if (vehicleNumber.isEmpty() || tollAmountStr.isEmpty() || paymentMethod == null) {
            showAlert("Input Error", "All fields are required.");
            return;
        }

        double tollAmount;
        try {
            tollAmount = Double.parseDouble(tollAmountStr);
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Toll amount must be a valid number.");
            return;
        }

        String invoiceID = "INV" + (invoiceList.size() + 1);
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


        invoiceList.add(new Invoice(invoiceID, date, vehicleNumber, tollAmount, paymentMethod));

        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setTitle("Payment Successful");
        success.setHeaderText(null);
        success.setContentText("Payment of " + tollAmount + " BDT for vehicle " + vehicleNumber +
                " via " + paymentMethod + " was successful!  Invoice saved.");
        success.showAndWait();

        clearFields();
    }

    @FXML
    public void btnCancel(ActionEvent actionEvent) {
        clearFields();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearFields() {
        txtVehicleNumber.clear();
        txtTollAmount.clear();
        comboPaymentMethod.setValue(null);
    }
}
