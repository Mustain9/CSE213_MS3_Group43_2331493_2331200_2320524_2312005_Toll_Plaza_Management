package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

        String ownerName = txtOwnerName.getText();
        String email = txtEmail.getText();
        String vehicleNumber = txtVehicleNumber.getText();
        String vehicleType = comboVehicleType.getValue();
        String phoneNumberText = txtphoneNumber.getText();



        if (vehicleNumber.isEmpty() || vehicleType == null || phoneNumberText.isEmpty() ||
                ownerName.isEmpty() || email.isEmpty()) {
            showAlert("Input Error", "All fields are required.");
            return;
        }

        int phoneNumber;

        try {
            phoneNumber = Integer.parseInt(phoneNumberText);
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Phone Number must be a number.");
            return;
        }

        Vehicle vehicleToBeAdded = new Vehicle(ownerName, email, vehicleNumber, vehicleType,phoneNumber);

        VehicleList.add(vehicleToBeAdded);
        tableRegisteredVehicles.getItems().add(vehicleToBeAdded);
        clearFields();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void clearFields() {
        txtVehicleNumber.clear();
        comboVehicleType.setValue(null);
        txtphoneNumber.clear();
        txtOwnerName.clear();
        txtEmail.clear();}




    @FXML
    public void ClearField(ActionEvent actionEvent) {

    }
}
