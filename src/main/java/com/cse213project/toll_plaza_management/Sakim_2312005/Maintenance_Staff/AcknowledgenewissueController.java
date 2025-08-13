package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AcknowledgenewissueController
{
    @javafx.fxml.FXML
    private TextField notificationIdTf;
    @javafx.fxml.FXML
    private TableColumn<String, String> issueSummaryTc;
    @javafx.fxml.FXML
    private TextArea reportWriteTa;
    @javafx.fxml.FXML
    private TextArea issueSummaryTa;
    @javafx.fxml.FXML
    private TableColumn<String, String> reportTc;
    @javafx.fxml.FXML
    private TableColumn<String, String> notificationIdTc;
    @javafx.fxml.FXML
    private TableView<String> notificationTv;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void issueButtonOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnation(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Maintenance_Staff/MaintenanceStuffDashboard.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Maintenance Stuff Dashboard");
        stage.show();
    }
}