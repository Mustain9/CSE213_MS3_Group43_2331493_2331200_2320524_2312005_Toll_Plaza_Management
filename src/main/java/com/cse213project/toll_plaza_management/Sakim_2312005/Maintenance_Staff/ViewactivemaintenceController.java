package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ViewactivemaintenceController
{
    @javafx.fxml.FXML
    private TextField locationTf;
    @javafx.fxml.FXML
    private TableColumn<ActiveIssue, String> locationTc;
    @javafx.fxml.FXML
    private DatePicker dateReportedDp;
    @javafx.fxml.FXML
    private TextField issueIdTf;
    @javafx.fxml.FXML
    private TableColumn<ActiveIssue, String> dateTc;
    @javafx.fxml.FXML
    private TableColumn<ActiveIssue, String> issueIdTc;
    @javafx.fxml.FXML
    private ComboBox<String> issueTypeCb;
    @javafx.fxml.FXML
    private TableColumn<ActiveIssue, String> issueTypeTc;
    @javafx.fxml.FXML
    private TableView<ActiveIssue> activeIssueTv;

    ArrayList<ActiveIssue> ActiveIssueList;


    @javafx.fxml.FXML
    public void initialize() {
        issueTypeCb.getItems().addAll(" All", "Open", "In Progress", "Fixed", "Closed");
        dateReportedDp.setValue(LocalDate.now());
        issueIdTc.setCellValueFactory(new PropertyValueFactory<ActiveIssue, String>("issueId"));
        issueTypeTc.setCellValueFactory(new PropertyValueFactory<ActiveIssue, String>("issueType"));
        dateTc.setCellValueFactory(new PropertyValueFactory<ActiveIssue, String>("dateReported"));
        locationTc.setCellValueFactory(new PropertyValueFactory<ActiveIssue, String>("location"));




    }

    @javafx.fxml.FXML
    public void viewMaintenanceOnaction(ActionEvent actionEvent) {
        ActiveIssue ActiveIssueToBeAdded = new ActiveIssue (
                Integer.parseInt(issueIdTf.getText()),
                issueTypeCb.getValue(),
                dateReportedDp.getValue(),
                locationTf.getText()
        );
        activeIssueTv.getItems().add(ActiveIssueToBeAdded);
        ActiveIssueList.add(ActiveIssueToBeAdded);
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