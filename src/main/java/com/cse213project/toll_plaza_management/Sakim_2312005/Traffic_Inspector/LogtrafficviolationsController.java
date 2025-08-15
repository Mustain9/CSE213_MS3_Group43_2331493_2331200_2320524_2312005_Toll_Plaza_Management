package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class LogtrafficviolationsController
{
    @javafx.fxml.FXML
    private ComboBox<String> violationtypeCb;
    @javafx.fxml.FXML
    private TextArea notesTa;
    @javafx.fxml.FXML
    private TextField vehicleidTf;

    ArrayList<TrafficViolation> TrafficViolationList;


    @javafx.fxml.FXML
    public void initialize() {
        TrafficViolationList = new ArrayList<>();
        violationtypeCb.getItems().addAll("Wrong Way", "No Entry", "Lane Changed", "Speed");
    }

    @javafx.fxml.FXML
    public void submitviolationOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void attachevidenceOnaction(ActionEvent actionEvent) {
        TrafficViolation TrafficViolationToBeAdded = new TrafficViolation (
                Integer.parseInt(vehicleidTf.getText()),
                violationtypeCb.getValue(),
                notesTa.getText()
        );
    }

    @javafx.fxml.FXML
    public void backOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/TrafficInspectorDashboard.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Traffic Inspector Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void backOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/TrafficInspectorDashboard.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Traffic Inspector Dashboard");
        stage.show();
    }
}