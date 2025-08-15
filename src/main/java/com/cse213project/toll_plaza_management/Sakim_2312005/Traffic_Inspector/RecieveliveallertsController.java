package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class RecieveliveallertsController
{
    @javafx.fxml.FXML
    private TableView<LiveAlert> alertTv;
    @javafx.fxml.FXML
    private TextArea alertTf;
    @javafx.fxml.FXML
    private TableColumn<LiveAlert, String> carTc;
    @javafx.fxml.FXML
    private TableColumn<LiveAlert, String> busTc;
    @javafx.fxml.FXML
    private TableColumn<LiveAlert, String> truckTc;
    @javafx.fxml.FXML
    private TableColumn<LiveAlert, String> minibusTc;
    @javafx.fxml.FXML
    private TextField miniBusCountTf;
    @javafx.fxml.FXML
    private TextField carCountTf;
    @javafx.fxml.FXML
    private TextField truckCountTf;
    @javafx.fxml.FXML
    private TextField busCountTf;

    ArrayList<LiveAlert> LiveAlertList;


    @javafx.fxml.FXML
    public void initialize() {
        LiveAlertList = new ArrayList<>();
        carTc.setCellValueFactory(new PropertyValueFactory<LiveAlert, String>("Car"));
        busTc.setCellValueFactory(new PropertyValueFactory<LiveAlert, String>("Bus"));
        truckTc.setCellValueFactory(new PropertyValueFactory<LiveAlert, String>("Truck"));
        minibusTc.setCellValueFactory(new PropertyValueFactory<LiveAlert, String>("Mini Bus"));
    }

    @javafx.fxml.FXML
    public void acknowledgeOnaction(ActionEvent actionEvent) {
        LiveAlert LiveAlertToBeAdded = new LiveAlert (
                carCountTf.getText(),
                busCountTf.getText(),
                truckCountTf.getText(),
                miniBusCountTf.getText(),
                alertTf.getText()


        );
        alertTv.getItems().add(LiveAlertToBeAdded);
        LiveAlertList.add(LiveAlertToBeAdded);
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