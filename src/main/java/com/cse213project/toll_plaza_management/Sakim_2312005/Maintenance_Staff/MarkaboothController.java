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
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MarkaboothController
{
    @javafx.fxml.FXML
    private CheckBox statusCb;
    @javafx.fxml.FXML
    private CheckBox boothCb;
    @javafx.fxml.FXML
    private TextArea operationReportTa;

    ArrayList<Booth> BoothList;


    @javafx.fxml.FXML
    public void initialize() {
        BoothList = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void markOperationalOnaction(ActionEvent actionEvent) {

        ArrayList<String> category = new ArrayList<String>();
        if (boothCb.isSelected() && statusCb.isSelected()) {
            category.add("Booth");
            category.add("Status");
        }
        if (boothCb.isSelected())
            category.add("Booth");
        if (statusCb.isSelected())
            category.add("Status");

        Booth BoothToBeAdded = new Booth (
                operationReportTa.getText(),
                Arrays.toString(category.toArray())


        );



    }

    @javafx.fxml.FXML
    public void backOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Maintenance_Staff/MaintenanceStuffDashboard.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Maintenance Stuff Dashboard");
        stage.show();
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