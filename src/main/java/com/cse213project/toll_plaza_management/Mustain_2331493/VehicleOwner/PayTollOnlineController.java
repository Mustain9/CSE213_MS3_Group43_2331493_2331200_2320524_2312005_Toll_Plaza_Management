package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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

    @javafx.fxml.FXML
    public void initialize() {
        comboPaymentMethod.getItems().addAll("Bkash", "PayPal","Upay","Nogod");
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void btnCancel(ActionEvent actionEvent) {
    }

    @FXML
    public void btnPayToll(ActionEvent actionEvent) {


    }
}
