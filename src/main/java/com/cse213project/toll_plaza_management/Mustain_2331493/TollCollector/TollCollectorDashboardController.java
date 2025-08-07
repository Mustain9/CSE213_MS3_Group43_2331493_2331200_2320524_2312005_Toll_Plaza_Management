package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TollCollectorDashboardController {

    @FXML
    private Button btnCollectCashScreen;

    @FXML
    private Button btnFlagVehicleScreen;

    @FXML
    private Button btnIssueTemporaryTagScreen;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnReportIssueScreen;

    @FXML
    private Button btnScanTagScreen;

    @FXML
    private Button btnViewShiftSummaryScreen;

    @FXML
    private Button btnViewTollRatesScreen;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @FXML
    public void openCollectCashScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("collect_cash_toll.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Collect Cash Toll");
        stage.show();
    }

    @FXML
    public void openScanTagForPayment(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scan_tag_for_payment.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Scan Tag for Payment");
        stage.show();
    }

    @FXML
    public void openViewTollRate(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view_toll_rate.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View Toll Rate");
        stage.show();
    }

    @FXML
    public void openFlagVehicle(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("flag_vehicle.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Flag Vehicle");
        stage.show();
    }

    @FXML
    public void openIssueTemporaryTag(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("issue_temporary_tag.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Issue Temporary Tag");
        stage.show();
    }

    @FXML
    public void openReportIssue(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("report_issue.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Report Issue");
        stage.show();
    }

    @FXML
    public void openViewShiftSummary(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view_shift_summary.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View Shift Summary");
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
}

