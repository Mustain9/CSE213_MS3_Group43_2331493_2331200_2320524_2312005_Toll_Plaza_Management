package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportTagIssueController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSubmitIssue;

    @FXML
    private ComboBox<String> comboIssueType;

    @FXML
    private TextArea txtIssueDescription;

    @FXML
    private TextField txtTagID;

    @javafx.fxml.FXML
    public void initialize() {
        comboIssueType.getItems().addAll("Lost Tag", "Damaged Tag", "Incorrect Balance", "Tag Not Working", "Other");
    }

    @FXML
    public void goBackToDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Mustain_2331493/VehicleOwner/vehicle_owner_dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void btnSubmitAction(ActionEvent actionEvent) {
        String tagID = txtTagID.getText();
        String issueType = comboIssueType.getValue();
        String issueDescription = txtIssueDescription.getText();

        if (tagID.isEmpty() || issueType == null || issueDescription.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "All fields are required.");
            return;
        }

        showAlert(Alert.AlertType.INFORMATION, "Issue Reported",
                "Issue for Tag " + tagID + " has been reported.\n" +
                        "Type: " + issueType + "\n" +
                        "Description: " + issueDescription);

        clearFields();
    }

    @FXML
    public void btnCancelAction(ActionEvent actionEvent) {
        clearFields();
    }
    private void clearFields() {
        txtTagID.clear();
        txtIssueDescription.clear();
        comboIssueType.setValue(null);
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
