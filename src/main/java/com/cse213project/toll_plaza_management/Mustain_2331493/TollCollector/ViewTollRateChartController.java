package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner.TollRate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewTollRateChartController {

    @FXML
    private Button btnBack;

    @FXML
    private TableColumn<TollRate, Double> colMonthlyRate;

    @FXML
    private TableColumn<TollRate, Double> colOneWayRate;

    @FXML
    private TableColumn<TollRate, Double> colRoundTripRate;

    @FXML
    private TableColumn<TollRate, String> colVehicleType;

    @FXML
    private TableView<TollRate> tableTollRates;

    private ObservableList<TollRate> tollRatesList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        colVehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        colOneWayRate.setCellValueFactory(new PropertyValueFactory<>("oneWayRate"));
        colRoundTripRate.setCellValueFactory(new PropertyValueFactory<>("roundTripRate"));
        colMonthlyRate.setCellValueFactory(new PropertyValueFactory<>("monthlyRate"));

        tollRatesList.add(new TollRate("Car", 50.0, 90.0, 1500.0));
        tollRatesList.add(new TollRate("Truck", 100.0, 180.0, 3500.0));
        tollRatesList.add(new TollRate("Bus", 80.0, 150.0, 3000.0));

        tableTollRates.setItems(tollRatesList);
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/TollCollector/toll_collector_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
