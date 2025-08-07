package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class VehicleRegisterController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnClearForm;

    @FXML
    private Button btnRegisterVehicle;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colMobileNumber;

    @FXML
    private TableColumn<?, ?> colOwnerName;

    @FXML
    private TableColumn<?, ?> colVehicleNumber;

    @FXML
    private TableColumn<?, ?> colVehicleType;

    @FXML
    private ComboBox<?> comboVehicleType;

    @FXML
    private TableView<?> tableRegisteredVehicles;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtMobileNumber;

    @FXML
    private TextField txtOwnerName;

    @FXML
    private TextField txtVehicleNumber;

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

}
