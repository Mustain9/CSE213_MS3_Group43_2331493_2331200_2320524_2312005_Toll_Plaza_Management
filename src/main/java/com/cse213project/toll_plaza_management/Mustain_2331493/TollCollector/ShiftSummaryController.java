package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ShiftSummaryController {

    @FXML private Button btnBack;
    @FXML private Button btnExportPDF;

    @FXML private TableColumn<ShiftRecord, String> colPaymentMethod;
    @FXML private TableColumn<ShiftRecord, String> colTime;
    @FXML private TableColumn<ShiftRecord, Double> colTollAmount;
    @FXML private TableColumn<ShiftRecord, String> colVehicleNo;
    @FXML private TableColumn<ShiftRecord, String> colVehicleType;

    @FXML private TextField lblCollectorName;
    @FXML private TextField lblShiftID;
    @FXML private TextField lblShiftTime;

    @FXML private Label lblTotalCollected;
    @FXML private Label lblTotalVehicles;

    @FXML private TableView<ShiftRecord> tableShiftSummary;

    public ArrayList<ShiftRecord> ShiftList = new ArrayList<>();


    @FXML
    public void initialize() {

        colVehicleNo.setCellValueFactory(new PropertyValueFactory<>("vehicleNo"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        colTollAmount.setCellValueFactory(new PropertyValueFactory<>("tollAmount"));
        colPaymentMethod.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("time"));

        ShiftList.add(new ShiftRecord("DHA-1234", "Car", "Cash" , 200.0,  "10:30 AM"));
        ShiftList.add(new ShiftRecord("CTG-5678", "Truck", "Card", 500.0,  "11:00 AM"));

        tableShiftSummary.setItems(FXCollections.observableArrayList(ShiftList));
    }



    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/TollCollector/toll_collector_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
