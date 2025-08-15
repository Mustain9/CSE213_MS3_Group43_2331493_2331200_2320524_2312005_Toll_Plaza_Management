package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuManagingDirectorController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    public void openAnalyzeTrafficPatterns(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/AnalyzeTrafficPatterns.fxml");
    }

    @FXML
    public void openApproveAllocateBudgets(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/Approve&AllocateBudgets.fxml");
    }

    @FXML
    public void openApproveReports(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/ApproveFinancial&OperationalReports.fxml");
    }

    @FXML
    public void openCoordinateAuthorities(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/CoordinateAuthorities.fxml");
    }

    @FXML
    public void openEvaluateMaintenanceNeeds(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/EvaluateMaintenanceNeeds.fxml");
    }

    @FXML
    public void openMonitorRevenue(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/MonitorDailyMonthlyTollRevenue.fxml");
    }

    @FXML
    public void openPolicyGuidelines(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/AddPolicy&Guidelines.fxml");
    }

    @FXML
    public void openScheduleEmergencyMeeting(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/ScheduleEmergencyMeeting.fxml");
    }

    @FXML
    public void openLogin(ActionEvent event) {
        loadScene("/com/cse213project/toll_plaza_management/common/login.fxml");
    }

    private void loadScene(String resourcePath) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(resourcePath));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception ex) {
            // Optionally log the exception or show an alert
        }
    }
}