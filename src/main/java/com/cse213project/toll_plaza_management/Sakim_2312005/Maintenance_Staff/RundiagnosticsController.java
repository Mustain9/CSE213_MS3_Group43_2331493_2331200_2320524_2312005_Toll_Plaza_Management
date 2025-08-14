package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class RundiagnosticsController
{
    @javafx.fxml.FXML
    private ComboBox<String> hardwareSelectCb;
    @javafx.fxml.FXML
    private TextArea diagnosticsReportTa;

    ArrayList<Diagnostics> DiagnosticsList;


    @javafx.fxml.FXML
    public void initialize() {
        DiagnosticsList = new ArrayList<>();
        hardwareSelectCb.getItems().addAll(" Barrier Gate", "Camera", "Sensor", "Payment Terminal");


    }

    @javafx.fxml.FXML
    public void runDiagnosticsOnaction(ActionEvent actionEvent) throws IOException {
        Diagnostics DiagnosticsToBeAdded = new Diagnostics (
                diagnosticsReportTa.getText(),
                hardwareSelectCb.getValue()
        );


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