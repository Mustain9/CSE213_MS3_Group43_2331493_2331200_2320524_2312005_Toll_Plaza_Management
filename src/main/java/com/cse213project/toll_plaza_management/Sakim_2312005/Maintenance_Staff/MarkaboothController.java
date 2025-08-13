package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class MarkaboothController
{
    @javafx.fxml.FXML
    private CheckBox statusCb;
    @javafx.fxml.FXML
    private CheckBox boothCb;
    @javafx.fxml.FXML
    private TextArea operationReportTa;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void markOperationalOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Maintenance_Staff/MaintenanceStuffDashboard.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Maintenance Stuff Dashboard");
        stage.show();
    }
}