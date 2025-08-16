package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ViewentryandexitController
{
    @javafx.fxml.FXML
    private TableView<EntryExitLog> logstableTv;
    @javafx.fxml.FXML
    private TableColumn<EntryExitLog, String> lanesTc;
    @javafx.fxml.FXML
    private TextField vehicleidTf;
    @javafx.fxml.FXML
    private TableColumn<EntryExitLog, String> timestampsTc;
    @javafx.fxml.FXML
    private TableColumn<EntryExitLog, String> idTc;
    @javafx.fxml.FXML
    private TextField laneTf;

    @javafx.fxml.FXML
    private DatePicker timestampsDp;

    ArrayList<EntryExitLog> EntryExitLogList;


    @javafx.fxml.FXML
    public void initialize() {
        EntryExitLogList = new ArrayList<>();
        timestampsDp.setValue(LocalDate.now());
        idTc.setCellValueFactory(new PropertyValueFactory<EntryExitLog, String>("vehicleId"));
        lanesTc.setCellValueFactory(new PropertyValueFactory<EntryExitLog, String>("lane"));
        timestampsTc.setCellValueFactory(new PropertyValueFactory<EntryExitLog, String>("TimeStamps"));
    }

    @javafx.fxml.FXML
    public void csvOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchlogsOnaction(ActionEvent actionEvent) {
        EntryExitLog EntryExitLogToBeAdded = new EntryExitLog (
                Integer.parseInt(vehicleidTf.getText()),
                laneTf.getText(),
                timestampsDp.getValue()
        );
        logstableTv.getItems().add(EntryExitLogToBeAdded);
        EntryExitLogList.add(EntryExitLogToBeAdded);
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