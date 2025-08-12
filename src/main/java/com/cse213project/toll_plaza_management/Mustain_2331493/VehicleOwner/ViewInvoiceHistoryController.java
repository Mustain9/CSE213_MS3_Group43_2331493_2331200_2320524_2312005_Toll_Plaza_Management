package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewInvoiceHistoryController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnViewInvoiceDetails;

    @FXML
    private TableColumn<Invoice, String> colInvoiceDate;

    @FXML
    private TableColumn<Invoice, String> colInvoiceID;

    @FXML
    private TableColumn<Invoice, String> colNoOfTrips;

    @FXML
    private TableColumn<Invoice, String> colTotalAmount;

    @FXML
    private TableView<Invoice> tableInvoices;

    @javafx.fxml.FXML
    public void initialize() {

        colInvoiceID.setCellValueFactory(new PropertyValueFactory<>("InvoiceID"));
        colInvoiceDate.setCellValueFactory(new PropertyValueFactory<>("InvoiceDate"));
        colTotalAmount.setCellValueFactory(new PropertyValueFactory<>("TotalAmount"));
        colNoOfTrips.setCellValueFactory(new PropertyValueFactory<>("NoOfTrip"));

//        colInvoiceID.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInvoiceID()));
//        colInvoiceDate.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDate()));
//        colTotalAmount.setCellValueFactory(data -> new SimpleStringProperty(new DecimalFormat("#.00").format(data.getValue().gettollAmountt())));
//        colNoOfTrips.setCellValueFactory(data -> new SimpleStringProperty("1"));


        tableInvoices.setItems(PayTollOnlineController.invoiceList);
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void handleViewInvoiceDetails(ActionEvent actionEvent) {
        Invoice selected = tableInvoices.getSelectionModel().getSelectedItem();
        if (selected == null) {
            showAlert("No Selection", "Please select an invoice to view details.");
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Invoice Details");
        alert.setHeaderText("Details for Invoice " + selected.getInvoiceID());
        alert.setContentText(
                "Date: " + selected.getDate() +
                        "\nVehicle: " + selected.getVehicleNumber() +
                        "\nAmount: " + selected.gettollAmountt() +
                        "\nPayment Method: " + selected.getPaymentMethod()
        );
        alert.showAndWait();
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

