package com.cse213project.toll_plaza_management.Sonda_2331200.Supervisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SupervisorDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewReportBtn(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void PerfomanceBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewComplaintBtn(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Supervisor/ViewComplaints.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("delete complain ");
        stage.show();
       
    }

    @javafx.fxml.FXML
    public void deleteComplaintBtn(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("delete complain ");
        stage.show();
    }

    @javafx.fxml.FXML
    public void AssignComplainBtn(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Supervisor/AssignComplaintController.java"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("assign Complain");
        stage.show();
    }

    @javafx.fxml.FXML
    public void remainderBtn(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Supervisor/UpdateComplaintStatus.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("remainder");
        stage.show();
    }

    @javafx.fxml.FXML
    public void updateComplaintBtn(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Supervisor/UpdateComplaintStatus.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("update complaint");
        stage.show();
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent event) throws IOException {
        Parent root =FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
    }
}