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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class VehicleRegisterController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnClearForm;

    @FXML
    private Button btnRegisterVehicle;

    @FXML
    private TableColumn<Vehicle, String> colEmail;

    @FXML
    private TableColumn<Vehicle, String> colOwnerName;

    @FXML
    private TableColumn<Vehicle, String> colVehicleNumber;

    @FXML
    private TableColumn<Vehicle, String> colVehicleType;

    @FXML
    private ComboBox<String> comboVehicleType;

    @FXML
    private TableView<Vehicle> tableRegisteredVehicles;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtOwnerName;

    @FXML
    private TextField txtVehicleNumber;

    private ArrayList<Vehicle> VehicleList;
    @FXML
    private TextField txtphoneNumber;
    @FXML
    private TableColumn colPhoneNumber;

    @javafx.fxml.FXML
    public void initialize() {

        VehicleList = new ArrayList<>();
        comboVehicleType.getItems().addAll("Bike", "Car", "Truck", "Bus");

        colOwnerName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        colVehicleNumber.setCellValueFactory(new PropertyValueFactory<>("VehicleNumber"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory<>("VehicleType"));
        colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("PhoneNumber"));


    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void btnRegisterVehicle(ActionEvent actionEvent) {
        Vehicle vehicleToBeAdded =  new Vehicle(
                txtOwnerName.getText(),
                txtEmail.getText(),
                txtVehicleNumber.getText(),
                comboVehicleType.getValue(),
                Integer.parseInt(txtphoneNumber.getText()));

        VehicleList.add(vehicleToBeAdded);
        tableRegisteredVehicles.getItems().add(vehicleToBeAdded);

    }
}
