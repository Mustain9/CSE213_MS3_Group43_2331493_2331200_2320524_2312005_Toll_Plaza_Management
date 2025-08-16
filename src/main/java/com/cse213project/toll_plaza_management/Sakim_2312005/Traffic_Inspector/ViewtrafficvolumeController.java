package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class ViewtrafficvolumeController
{
    @javafx.fxml.FXML
    private TableColumn<TrafficVolume,String> directionTc;
    @javafx.fxml.FXML
    private TableColumn<TrafficVolume,Integer> countTc;
    @javafx.fxml.FXML
    private TableColumn<TrafficVolume,String> vehicletypeTc;
    @javafx.fxml.FXML
    private TableView<TrafficVolume> vehiclecountTv;
    @javafx.fxml.FXML
    private ComboBox<String> selectlaneboothCb;
    @javafx.fxml.FXML
    private TextField countNumberTf;
    @javafx.fxml.FXML
    private TextField vehicleTypeTf;

    ObservableList<TrafficVolume> TrafficVolumeList = FXCollections.observableArrayList();






    @javafx.fxml.FXML
    public void initialize() {

        vehiclecountTv.setItems(TrafficVolumeList);



        selectlaneboothCb.getItems().addAll("Booth 1", "Booth 2", "lane A", "Lane B");
        directionTc.setCellValueFactory(new PropertyValueFactory<TrafficVolume, String>("direction"));
        vehicletypeTc.setCellValueFactory(new PropertyValueFactory<TrafficVolume, String>("vehicleType"));
        countTc.setCellValueFactory(new PropertyValueFactory<TrafficVolume, Integer>("count"));
    }

    @javafx.fxml.FXML
    public void viewcountOnaction(ActionEvent actionEvent) {

            TrafficVolume TrafficVolumeToBeAdded = new TrafficVolume (
                    selectlaneboothCb.getValue(),
                    vehicleTypeTf.getText(),
                    Integer.parseInt(countNumberTf.getText())

            );

            TrafficVolumeList.add(TrafficVolumeToBeAdded);
            vehiclecountTv.getItems().addAll(TrafficVolumeToBeAdded);





    }

    @javafx.fxml.FXML
    public void downloadOnaction(ActionEvent actionEvent) {
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