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

public class UploadmaintenancereportsController
{
    @javafx.fxml.FXML
    private TextField reportFilePathTf;
    @javafx.fxml.FXML
    private TextArea reportDescriptionTa;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceReport, String> filePathTc;
    @javafx.fxml.FXML
    private TableView<MaintenanceReport> maintenanceReportTv;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceReport, String> descriptionTc;

    ArrayList<MaintenanceReport> MaintenanceReportList;


    @javafx.fxml.FXML
    public void initialize() {
        filePathTc.setCellValueFactory(new PropertyValueFactory<MaintenanceReport, String>("filePath"));
        descriptionTc.setCellValueFactory(new PropertyValueFactory<MaintenanceReport, String>("description"));
    }

    @javafx.fxml.FXML
    public void saveReportOnaction(ActionEvent actionEvent) {
        MaintenanceReport MaintenanceReportToBeAdded = new MaintenanceReport (
                reportFilePathTf.getText(),
                reportDescriptionTa.getText()
        );
        maintenanceReportTv.getItems().add(MaintenanceReportToBeAdded);
        MaintenanceReportList.add(MaintenanceReportToBeAdded);
    }

    @javafx.fxml.FXML
    public void submitReportOnaction(ActionEvent actionEvent) {
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