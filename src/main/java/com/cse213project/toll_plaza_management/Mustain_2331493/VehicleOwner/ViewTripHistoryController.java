package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import javafx.collections.FXCollections;
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

import static com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner.PayTollOnlineController.tripList;

public class ViewTripHistoryController {

    @FXML
    private Button btnBack;

    @FXML
    private TableColumn<Trip, String> colDate;

    @FXML
    private TableColumn<Trip, String> colPaymentMethod;

    @FXML
    private TableColumn<Trip, Double> colTollAmount;

    @FXML
    private TableColumn<Trip, String> colTripID;

    @FXML
    private TableColumn<Trip, String> colVehicleNo;

    @FXML
    private TableView<Trip> tableTripHistory;

    @javafx.fxml.FXML
    public void initialize() {
        colTripID.setCellValueFactory(new PropertyValueFactory<>("tripID"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colVehicleNo.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        colPaymentMethod.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));
        colTollAmount.setCellValueFactory(new PropertyValueFactory<>("tollAmount"));

        tableTripHistory.setItems(FXCollections.observableArrayList(tripList));
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
