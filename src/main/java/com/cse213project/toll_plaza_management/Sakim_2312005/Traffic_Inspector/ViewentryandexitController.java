package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewentryandexitController
{
    @javafx.fxml.FXML
    private TableView logstableTv;
    @javafx.fxml.FXML
    private TableColumn lanesTc;
    @javafx.fxml.FXML
    private TextField vehicleidTf;
    @javafx.fxml.FXML
    private TableColumn timestampsTc;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void csvOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchlogsOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void pdfOnaction(ActionEvent actionEvent) {
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