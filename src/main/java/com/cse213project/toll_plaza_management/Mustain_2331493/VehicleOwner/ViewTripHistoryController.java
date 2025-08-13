package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewTripHistoryController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnSearchTrips;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colPaymentMethod;

    @FXML
    private TableColumn<?, ?> colTollAmount;

    @FXML
    private TableColumn<?, ?> colTripID;

    @FXML
    private TableColumn<?, ?> colVehicleNo;

    @FXML
    private ComboBox<?> comboVehicleFilter;

    @FXML
    private DatePicker dateFrom;

    @FXML
    private DatePicker dateTo;

    @FXML
    private TableView<?> tableTripHistory;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
