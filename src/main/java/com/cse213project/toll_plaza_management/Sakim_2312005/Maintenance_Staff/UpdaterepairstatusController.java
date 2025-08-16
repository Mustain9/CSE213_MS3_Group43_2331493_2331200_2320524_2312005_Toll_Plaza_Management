package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class UpdaterepairstatusController
{
    @javafx.fxml.FXML
    private ComboBox<String> currentStatusCb;
    @javafx.fxml.FXML
    private TableColumn<RepairStatus, String> currentStatusTc;
    @javafx.fxml.FXML
    private TableView<RepairStatus> showIssueTv;
    @javafx.fxml.FXML
    private TextField issueIdTf;
    @javafx.fxml.FXML
    private TableColumn<RepairStatus, String> issueIdTc;

    ArrayList<RepairStatus> RepairStatusList;



    @javafx.fxml.FXML
    public void initialize() {
        currentStatusCb.getItems().addAll(" In Progress", "Fixed", "Needs Parts", "On Hold");
        issueIdTc.setCellValueFactory(new PropertyValueFactory<RepairStatus, String>("issueId"));
        currentStatusTc.setCellValueFactory(new PropertyValueFactory<RepairStatus, String>("currentStatus"));
    }

    @javafx.fxml.FXML
    public void repairUpdateOnaction(ActionEvent actionEvent) {
        RepairStatus RepairStatusToBeAdded = new RepairStatus (
                Integer.parseInt(issueIdTf.getText()),
                currentStatusCb.getValue()
        );
        showIssueTv.getItems().add(RepairStatusToBeAdded);
        RepairStatusList.add(RepairStatusToBeAdded);
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