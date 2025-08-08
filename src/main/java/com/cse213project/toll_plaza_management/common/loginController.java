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
        roleCombobox.getItems().addAll("Vehicle Owner", "Toll Collector");
    }

    @FXML
    public void HandleLogin(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = roleCombobox.getValue();

        // 🔹 Simple check (replace with database check later)
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
