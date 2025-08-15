package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CommunicatesystemController
{
    @javafx.fxml.FXML
    private TableColumn<String, String> messageIdTc;
    private TableColumn<SentMessage, String> messageIdTc;
    @javafx.fxml.FXML
    private TextArea systemStatusMessageTa;
    @javafx.fxml.FXML
    private DatePicker dateSentDp;
    @javafx.fxml.FXML
    private TextField messageIdTf;
    @javafx.fxml.FXML
    private TableColumn<SentMessage, String> statusTc;
    private TableColumn<String, String> statusTc;
    @javafx.fxml.FXML
    private TableView<String> sentMessageTv;
    private TableView<SentMessage> sentMessageTv;
    @javafx.fxml.FXML
    private TableColumn<String, String> dateTc;
    private TableColumn<SentMessage, String> dateTc;

    ArrayList<SentMessage> SentMessageList;


    @javafx.fxml.FXML
    public void initialize() {
        SentMessageList = new ArrayList<>();
        dateSentDp.setValue(LocalDate.now());
        messageIdTc.setCellValueFactory(new PropertyValueFactory<SentMessage, String>("messageId"));
        statusTc.setCellValueFactory(new PropertyValueFactory<SentMessage, String>("status"));
        dateTc.setCellValueFactory(new PropertyValueFactory<SentMessage, String>("date"));
    }

    @javafx.fxml.FXML
    public void sendToAdminOnaction(ActionEvent actionEvent) {

        SentMessage SentMessageToBeAdded = new SentMessage (
                Integer.parseInt(messageIdTf.getText()),
                systemStatusMessageTa.getText(),
                dateSentDp.getValue()

        );
        sentMessageTv.getItems().add(SentMessageToBeAdded);
        SentMessageList.add(SentMessageToBeAdded);

    }

    @javafx.fxml.FXML
    public void backOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Maintenance_Staff/MaintenanceStuffDashboard.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Maintenance Stuff Dashboard");
        stage.show();

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