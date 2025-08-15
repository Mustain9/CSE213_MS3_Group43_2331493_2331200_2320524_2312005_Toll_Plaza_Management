package com.cse213project.toll_plaza_management.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;
    @FXML
    private Label errorLabel;
    @FXML
    private ComboBox<String> roleCombobox;

    @FXML
    public void initialize() {
        roleCombobox.getItems().addAll("Vehicle Owner", "Toll Collector", "Maintenance Stuff", "Traffic Inspector", "Supervisor", "Customer_Service_Agent", "Accountant", "Managing Director");
    }

    @FXML
    public void HandleLogin(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = roleCombobox.getValue();


        if (username.isEmpty() || password.isEmpty() || role == null) {
            errorLabel.setText("Please fill in all fields.");
            return;
        }

        if (role.equals("Vehicle Owner") && username.equals("owner") && password.equals("1234")) {
            loadDashboard(event, "/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml", "Vehicle Owner Dashboard");
        }
        else if (role.equals("Toll Collector") && username.equals("collector") && password.equals("1234")) {
            loadDashboard(event, "/com/cse213project/toll_plaza_management/Mustain_2331493/TollCollector/toll_collector_dashboard.fxml", "Toll Collector Dashboard");
        }
        else if (role.equals("Maintenance Stuff") && username.equals("Maintenance Stuff") && password.equals("1234")) {
            loadDashboard(event, "/com/cse213project/toll_plaza_management/Sakim_2312005/Maintenance_Staff/MaintenanceStuffDashboard.fxml", "Maintenance Stuff Dashboard");
        }
        else if (role.equals("Traffic Inspector") && username.equals("Traffic Inspector") && password.equals("1234")) {
            loadDashboard(event, "/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/TrafficInspectorDashboard.fxml", "Traffic Inspector Dashboard");
        }
        else if (role.equals("Supervisor") && username.equals("supervisor") && password.equals("1234")) {
            loadDashboard(event, "/com/cse213project/toll_plaza_management/Sonda_2331200/Supervisor/SupervisorDashboard.fxml", "Supervisor Dashboard");
        }
        else if (role.equals("Customer_Service_Agent") && username.equals("agent") && password.equals("1234")) {
            loadDashboard(event, "/com/cse213project/toll_plaza_management/Sonda_2331200/Customer_Service_Agent/AgentDashboard.fxml", "Agent Dashboard");
        } else if (role.equals("Accountant") && username.equals("accountant") && password.equals("1234")) {
            loadDashboard(event, "/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/MenuAccountant.fxml", "Accountant Dashboard - Annual Toll Collection");
        } else if (role.equals("Managing Director") && username.equals("director") && password.equals("1234")) {
            loadDashboard(event, "/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/MenuManagingDirector.fxml", "Managing Director Menu");
        }

        else {
            errorLabel.setText("Invalid credentials.");
        }
    }

    private void loadDashboard(ActionEvent event, String fxmlPath, String title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle(title);
        stage.show();
    }
}
