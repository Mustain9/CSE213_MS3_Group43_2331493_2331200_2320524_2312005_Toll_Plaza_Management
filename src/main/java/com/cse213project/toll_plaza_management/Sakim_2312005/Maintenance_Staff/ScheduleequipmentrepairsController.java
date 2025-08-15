package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleequipmentrepairsController
{
    @javafx.fxml.FXML
    private DatePicker repairDateDp;
    @javafx.fxml.FXML
    private ComboBox<String> timeSlotCb;
    @javafx.fxml.FXML
    private ComboBox<String> assignTeamCb;

    ArrayList<Equipment> EquipmentList;



    @javafx.fxml.FXML
    public void initialize() {
        EquipmentList = new ArrayList<>();
        timeSlotCb.getItems().addAll("Morning", "Afternoon", "Evening");
        assignTeamCb.getItems().addAll(" Team A", "Team B", "Individual Staff");
        repairDateDp.setValue(LocalDate.now());


    }

    @javafx.fxml.FXML
    public void scheduleRepairOnaction(ActionEvent actionEvent) {
        Equipment EquipmentToBeAdded = new Equipment (
                timeSlotCb.getValue(),
                assignTeamCb.getValue(),
                repairDateDp.getValue()


        );
    }

    @javafx.fxml.FXML
    public void confirmRepairOnaction(ActionEvent actionEvent) {
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