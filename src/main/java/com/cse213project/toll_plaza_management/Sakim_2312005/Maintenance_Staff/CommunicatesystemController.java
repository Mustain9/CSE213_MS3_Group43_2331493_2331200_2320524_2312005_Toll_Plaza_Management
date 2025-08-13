package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class CommunicatesystemController
{
    @javafx.fxml.FXML
    private TableColumn<String, String> messageIdTc;
    @javafx.fxml.FXML
    private TextArea systemStatusMessageTa;
    @javafx.fxml.FXML
    private DatePicker dateSentDp;
    @javafx.fxml.FXML
    private TextField messageIdTf;
    @javafx.fxml.FXML
    private TableColumn<String, String> statusTc;
    @javafx.fxml.FXML
    private TableView<String> sentMessageTv;
    @javafx.fxml.FXML
    private TableColumn<String, String> dateTc;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sendToAdminOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Maintenance_Staff/MaintenanceStuffDashboard.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Maintenance Stuff Dashboard");
        stage.show();

    }
}