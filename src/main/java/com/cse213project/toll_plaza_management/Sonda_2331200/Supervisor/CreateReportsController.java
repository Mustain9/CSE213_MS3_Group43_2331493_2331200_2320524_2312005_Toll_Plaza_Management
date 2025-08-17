package com.cse213project.toll_plaza_management.Sonda_2331200.Supervisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateReportsController {

    @FXML
    private ComboBox<?> reportType;

    @FXML
    void handleGenerateReport(ActionEvent event) {

    }

    @FXML
    public void backOnDashboard(ActionEvent event) throws IOException {
        FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Supervisor/SupervisorDashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
