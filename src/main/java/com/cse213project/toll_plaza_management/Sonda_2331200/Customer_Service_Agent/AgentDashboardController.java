package com.cse213project.toll_plaza_management.Sonda_2331200.Customer_Service_Agent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AgentDashboardController {

    @FXML
    public void logout(ActionEvent event) throws IOException {
        FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
    }


    @FXML
    public void contactcustomerbtn(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Customer_Service_Agent/ContactCustomer.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View report");
        stage.show();
    }

    @FXML
    public void closecomplaintbtn(ActionEvent actionEvent) {
    }

    @FXML
    public void addnotebtn(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Customer_Service_Agent/AddNote.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View report");
        stage.show();
    }

    @FXML
    public void assignedcomplaintsbtn(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Customer_Service_Agent/AssignedComplaints.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View report");
        stage.show();

    }

    @FXML
    public void searchComplainthistorybtn(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Customer_Service_Agent/SearchComplaintHistory.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View report");
        stage.show();}

    @FXML
    public void agentupdatestatusbtn(ActionEvent event)  throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Customer_Service_Agent/AgentUpdateStatus.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View report");
        stage.show();
    }
}
