package com.cse213project.toll_plaza_management.Sonda_2331200.Customer_Service_Agent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchComplaintHistoryController {

    @FXML
    private TableView<?> complaintHistoryTable;

    @FXML
    private TextField searchCustomerId;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void handleSearchComplaintHistory(ActionEvent event) {

    }

    @FXML
    public void backOnDashboard(ActionEvent event) throws IOException {
        FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Customer_Service_Agent/AgentDashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
