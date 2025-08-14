package com.cse213project.toll_plaza_management.Sonda_2331200.Supervisor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ViewComplaintsController {

    @FXML
    private TableColumn<Complaint, String> colAgent;

    @FXML
    private TableColumn<Complaint, String> colComplaintID;

    @FXML
    private TableColumn<Complaint, String> colDate;

    @FXML
    private TableColumn<Complaint, String> colName;

    @FXML
    private TableColumn<Complaint, String> colProblem;

    @FXML
    private TableColumn<Complaint, String> colStatus;

    @FXML
    private TableView<Complaint> complaintTable;

    @FXML
    private ComboBox<String> filterAgent;

    @FXML
    private DatePicker filterDate;

    @FXML
    private ComboBox<String> filterStatus;

    private ObservableList<Complaint> allComplaints = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colComplaintID.setCellValueFactory(new PropertyValueFactory<>("complaintID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colProblem.setCellValueFactory(new PropertyValueFactory<>("problem"));
        colAgent.setCellValueFactory(new PropertyValueFactory<>("agent"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));

        loadSampleData();
        loadFilterOptions();
    }

    private void loadSampleData() {
        allComplaints.addAll(
                new Complaint("C001", "John Doe", "Barrier not opening", "Agent 1", "Pending", "2025-08-01"),
                new Complaint("C002", "Jane Smith", "Payment not processed", "Agent 2", "Resolved", "2025-08-02"),
                new Complaint("C003", "Ali Khan", "Camera not working", "Agent 1", "Pending", "2025-08-03")
        );
        complaintTable.setItems(allComplaints);
    }

    private void loadFilterOptions() {
        filterAgent.getItems().addAll("All Agents", "Agent 1", "Agent 2");
        filterStatus.getItems().addAll("All Status", "Pending", "Resolved");
    }

    @FXML
    void OnFilterBtn(ActionEvent event) {
        ObservableList<Complaint> filteredList = FXCollections.observableArrayList();

        String selectedAgent = filterAgent.getValue();
        String selectedStatus = filterStatus.getValue();
        LocalDate selectedDate = filterDate.getValue();

        for (Complaint c : allComplaints) {
            boolean match = true;

            if (selectedAgent != null && !selectedAgent.equals("All Agents")) {
                if (!c.getAgent().equals(selectedAgent)) {
                    match = false;
                }
            }

            if (selectedStatus != null && !selectedStatus.equals("All Status")) {
                if (!c.getStatus().equals(selectedStatus)) {
                    match = false;
                }
            }

            if (selectedDate != null) {
                if (!c.getDate().equals(selectedDate)) {
                    match = false;
                }
            }

            if (match) {
                filteredList.add(c);
            }



        complaintTable.setItems(filteredList);}
    }

    @FXML
    public void backOnDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sonda_2331200/Supervisor/SupervisorDashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}


