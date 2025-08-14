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
    private Button addnotebtn;


    @FXML
    private Button agentdashboardbtn;

    @FXML
    private Button agentupdatestatusbtn;

    @FXML
    private Button assignedcomplaintsbtn;

    @FXML
    private Button closecomplaintbtn;

    @FXML
    private Button contactcustomerbtn;

    @FXML
    private Button logoutbtn;



    @FXML
    private Button searchComplainthistorybtn;

    @FXML
    void AssignComplainBtn(ActionEvent event) {

    }

    @FXML
    public void PerfomanceBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("perfomance");
        stage.show();

    }

    @FXML
    public void ViewComplaintBtn(ActionEvent event)  throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("ViewComplaint");
        stage.show();


    }

    @FXML
    public void deleteComplaintBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("delete complaint");
        stage.show();

    }

    @FXML
    public void logout(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
    }

    @FXML
    void remainderBtn(ActionEvent event) {

    }

    @FXML
    public void updateComplaintBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("ViewComplaint");
        stage.show();


    }

    @FXML
    public void viewReportBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View report");
        stage.show();

    }

}
