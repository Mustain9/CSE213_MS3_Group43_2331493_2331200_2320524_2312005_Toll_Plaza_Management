package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ShiftSummaryController {

    @FXML
    private Button btnBack;

    @FXML
    private TableColumn<ShiftRecord, String> colPaymentMethod;

    @FXML
    private TableColumn<ShiftRecord, String> colTime;

    @FXML
    private TableColumn<ShiftRecord, Double> colTollAmount;

    @FXML
    private TableColumn<ShiftRecord, String> colVehicleNo;

    @FXML
    private TableColumn<ShiftRecord, String> colVehicleType;

    @FXML
    private TextField lblCollectorName;

    @FXML
    private TextField lblShiftID;

    @FXML
    private TextField lblShiftTime;

    @FXML
    private Label lblTotalCollected;

    @FXML
    private Label lblTotalVehicles;

    @FXML
    private TableView<ShiftRecord> tableShiftSummary;

    private ObservableList<ShiftRecord> shiftData = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {


        colVehicleNo.setCellValueFactory(new PropertyValueFactory<>("Vehicle No"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory<>("Vehicle Type"));
        colPaymentMethod.setCellValueFactory(new PropertyValueFactory<>("Payment Method"));
        colTollAmount.setCellValueFactory(new PropertyValueFactory<>("Toll Amount"));
        colTime.setCellValueFactory(new PropertyValueFactory<>("Time"));

        loadDummyData();
        updateSummaryLabels();
    }

    private void loadDummyData() {
        shiftData.addAll(
                new ShiftRecord("CAR-1234", "Car", "Cash", 100.0, "08:15 AM"),
                new ShiftRecord("TRK-5678", "Truck", "Tag", 250.0, "09:30 AM"),
                new ShiftRecord("BUS-9999", "Bus", "Cash", 300.0, "10:05 AM")
        );
        tableShiftSummary.setItems(shiftData);
    }

    private void updateSummaryLabels() {
        double totalCollected = shiftData.stream().mapToDouble(ShiftRecord::getTollAmount).sum();
        lblTotalCollected.setText(String.format("%.2f", totalCollected));
        lblTotalVehicles.setText(String.valueOf(shiftData.size()));
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/TollCollector/toll_collector_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
