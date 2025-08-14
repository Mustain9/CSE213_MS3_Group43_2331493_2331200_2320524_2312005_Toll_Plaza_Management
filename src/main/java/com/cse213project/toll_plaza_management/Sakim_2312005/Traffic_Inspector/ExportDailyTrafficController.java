package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

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

public class ExportDailyTrafficController
{
    @javafx.fxml.FXML
    private ComboBox<String> selectrangeCb;
    @javafx.fxml.FXML
    private ComboBox<String> selectboothCb;
    @javafx.fxml.FXML
    private TextArea reportTf;

    ArrayList<ExportDaily> ExportDailyList;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void pdfexcelOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clickgeneratereportOnaction(ActionEvent actionEvent) {
        ExportDaily ExportDailyToBeAdded = new ExportDaily (
                selectrangeCb.getValue(),
                selectboothCb.getValue(),
                reportTf.getText()

        );
    }

    @javafx.fxml.FXML
    public void backOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/TrafficInspectorDashboard.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Traffic Inspector Dashboard");
        stage.show();
    }
}