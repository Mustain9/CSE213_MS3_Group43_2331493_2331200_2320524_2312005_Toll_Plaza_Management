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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class AcknowledgenewissueController
{
    @javafx.fxml.FXML
    private TextField notificationIdTf;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> issueSummaryTc;
    @javafx.fxml.FXML
    private TextArea reportWriteTa;
    @javafx.fxml.FXML
    private TextArea issueSummaryTa;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> reportTc;
    @javafx.fxml.FXML
    private TableColumn<Notification, String> notificationIdTc;
    @javafx.fxml.FXML
    private TableView<Notification> notificationTv;

    ArrayList<Notification> NotificationList;

    @javafx.fxml.FXML
    public void initialize() {
        NotificationList = new ArrayList<>();
        notificationIdTc.setCellValueFactory(new PropertyValueFactory<Notification, String>("notificationId"));
        issueSummaryTc.setCellValueFactory(new PropertyValueFactory<Notification, String>("issueSummary"));
        reportTc.setCellValueFactory(new PropertyValueFactory<Notification,String>("report"));
    }


    @javafx.fxml.FXML
    public void issueButtonOnaction(ActionEvent actionEvent) {

        Notification NotificationToBeAdded = new Notification (
                Integer.parseInt(notificationIdTf.getText()),
                issueSummaryTa.getText(),
                reportWriteTa.getText()
        );
        notificationTv.getItems().add(NotificationToBeAdded);
        NotificationList.add(NotificationToBeAdded);
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