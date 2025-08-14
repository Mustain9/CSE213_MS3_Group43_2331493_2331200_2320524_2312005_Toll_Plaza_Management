package com.cse213project.toll_plaza_management.Sonda_2331200.Customer_Service_Agent;

import com.cse213project.toll_plaza_management.Sonda_2331200.Supervisor.Complaint;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;



public class AssignedComplaintsController
{
    @javafx.fxml.FXML
    private TableView<Complaint> assignedComplaintsTable;
    @FXML
    private TableColumn<Complaint, String> colName;
    @FXML
    private TableColumn<Complaint, String> colProblem;
    @FXML
    private TableColumn<Complaint, String> colDate;
    @FXML
    private TableColumn<Complaint, String> colID;
    @FXML
    private TableColumn<Complaint, String> colStatus;

    private ComplaintService complaintService = new ComplaintService();

    @javafx.fxml.FXML
    public void initialize() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colProblem.setCellValueFactory(new PropertyValueFactory<>("problem"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colID.setCellValueFactory(new PropertyValueFactory<>("complaintID"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        loadAssignedComplaints();
    }

    private void loadAssignedComplaints() {
        ObservableList<Complaint> complaints = FXCollections.observableArrayList(
                ComplaintService.getAssignedComplaints(getCurrentAgentName())
        );
        assignedComplaintsTable.setItems(complaints);
    }

    private String getCurrentAgentName() {
        return "Sonda";
    }

    public class ComplaintService {

        public static ObservableList<Complaint> getAssignedComplaints(String agentName) {
            return FXCollections.observableArrayList(
                    new Complaint("C001", "Alice", "Internet down", "Sonda", "Pending", "2025-08-14"),
                    new Complaint("C002", "Bob", "Slow speed","John Doe" , "Resolved", "2025-08-13")
            );
        }
    }

    @FXML
    public void backOnDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Customer_Service_Agent/AgentDashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}