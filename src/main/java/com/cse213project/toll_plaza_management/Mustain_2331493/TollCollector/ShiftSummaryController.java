package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

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
import javafx.stage.Stage;

import java.io.IOException;

public class ShiftSummaryController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnExportPDF;

    @FXML
    private TableColumn<?, ?> colPaymentMethod;

    @FXML
    private TableColumn<?, ?> colTime;

    @FXML
    private TableColumn<?, ?> colTollAmount;

    @FXML
    private TableColumn<?, ?> colVehicleNo;

    @FXML
    private TableColumn<?, ?> colVehicleType;

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
    private TableView<?> tableShiftSummary;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/TollCollector/toll_collector_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
