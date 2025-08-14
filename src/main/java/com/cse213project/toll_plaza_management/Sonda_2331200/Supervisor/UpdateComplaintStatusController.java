package com.cse213project.toll_plaza_management.Sonda_2331200.Supervisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdateComplaintStatusController {

    @FXML
    private TableView<?> complaintsTable;

    @FXML
    private ComboBox<?> statusList;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void handleUpdateStatusConfirm(ActionEvent event) {

    }

    @FXML
    public void backOnDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Supervisor/SupervisorDashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
