package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuAccountantController {
    @FXML
    private AnchorPane rootPane;

    @FXML
    public void openMonthlyFinancialJournal(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/MonthlyFinancialJournal.fxml");
    }

    @FXML
    public void openValidationStatus(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/ValidationStatus.fxml");
    }

    @FXML
    public void openIncomeExpenseSummary(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/IncomeExpenseSummary.fxml");
    }

    @FXML
    public void openEditingFinancialTransaction(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/EditingFinancialTransaction.fxml");
    }

    @FXML
    public void openShiftwiseTollReport(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/GenerateShiftwisseTollReport.fxml");
    }

    @FXML
    public void openManageEmployeePayments(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/ManageEmployeePayments.fxml");
    }

    @FXML
    public void openUpdateTollRates(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/UpdateTollRates.fxml");
    }

    @FXML
    public void openTrackAnnualTollCollection(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/Auvi_2320524/Accountaant/TrackAnnualTollCollection.fxml");
    }

    @FXML
    public void openLogin(ActionEvent e) {
        loadScene("/com/cse213project/toll_plaza_management/common/login.fxml");
    }

    private void loadScene(String resourcePath) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(resourcePath));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception ex) {
        }
    }
}
