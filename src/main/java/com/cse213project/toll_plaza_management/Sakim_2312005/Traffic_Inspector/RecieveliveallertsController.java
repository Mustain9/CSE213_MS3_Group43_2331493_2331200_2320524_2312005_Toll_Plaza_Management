package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class RecieveliveallertsController
{
    @javafx.fxml.FXML
    private TableView alertTv;
    @javafx.fxml.FXML
    private TextArea alertTf;
    @javafx.fxml.FXML
    private TableColumn carTc;
    @javafx.fxml.FXML
    private TableColumn busTc;
    @javafx.fxml.FXML
    private TableColumn truckTc;
    @javafx.fxml.FXML
    private TableColumn minibusTc;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void acknowledgeOnaction(ActionEvent actionEvent) {
    }
}