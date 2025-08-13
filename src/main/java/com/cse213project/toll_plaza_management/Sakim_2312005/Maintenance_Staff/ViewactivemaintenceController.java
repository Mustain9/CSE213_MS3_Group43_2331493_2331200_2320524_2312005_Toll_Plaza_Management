package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewactivemaintenceController
{
    @javafx.fxml.FXML
    private TextField locationTf;
    @javafx.fxml.FXML
    private TableColumn locationTc;
    @javafx.fxml.FXML
    private DatePicker dateReportedDp;
    @javafx.fxml.FXML
    private TextField issueIdTf;
    @javafx.fxml.FXML
    private TableColumn dateTc;
    @javafx.fxml.FXML
    private TableColumn issueIdTc;
    @javafx.fxml.FXML
    private ComboBox issueTypeCb;
    @javafx.fxml.FXML
    private TableColumn issueTypeTc;
    @javafx.fxml.FXML
    private TableView activeIssueTv;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewMaintenanceOnaction(ActionEvent actionEvent) {
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