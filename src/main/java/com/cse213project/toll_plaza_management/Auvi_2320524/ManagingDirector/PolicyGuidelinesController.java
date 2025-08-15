package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector;

import com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model.PolicyRecord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;

public class PolicyGuidelinesController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TableView<PolicyRecord> policyTable;
    @FXML
    private TableColumn<PolicyRecord, String> titleColumn;
    @FXML
    private TableColumn<PolicyRecord, LocalDate> dateColumn;
    @FXML
    private TableColumn<PolicyRecord, String> descriptionColumn;
    @FXML
    private TableColumn<PolicyRecord, String> actionsColumn;
    @FXML
    private VBox addFormBox;
    @FXML
    private TextField policyTitleField;
    @FXML
    private DatePicker effectiveDatePicker;
    @FXML
    private TextArea policyDescriptionArea;
    @FXML
    private Label statusLabel;

    private final ArrayList<PolicyRecord> policies = new ArrayList<>();

    @FXML
    public void initialize() {
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        actionsColumn.setCellValueFactory(new PropertyValueFactory<>("action"));
        statusLabel.setText("");
        addFormBox.setDisable(false);
    }

    @FXML
    public void handleShowAddForm(ActionEvent event) {
        addFormBox.setDisable(false);
    }

    @FXML
    public void handleSavePolicy(ActionEvent event) {
        String title = policyTitleField.getText();
        LocalDate date = effectiveDatePicker.getValue();
        String description = policyDescriptionArea.getText();
        if (title == null || title.isBlank() || date == null || description == null || description.isBlank()) {
            statusLabel.setText("Enter title, date and description");
            return;
        }
        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Confirm");
        confirm.setHeaderText(null);
        confirm.setContentText("Apply this policy?");
        confirm.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
        ButtonType res = confirm.showAndWait().orElse(ButtonType.NO);
        if (res != ButtonType.YES) {
            return;
        }
        policies.add(new PolicyRecord(title, date, description));
        policyTable.getItems().setAll(policies);
        statusLabel.setText("Policy Added Successfully");
        policyTitleField.clear();
        effectiveDatePicker.setValue(null);
        policyDescriptionArea.clear();
    }

    @FXML
    public void handleLogout(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
        }
    }

    @FXML
    public void handleBackToMenu(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Auvi_2320524/ManagingDirector/MenuManagingDirector.fxml"));
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.centerOnScreen();
        } catch (Exception e) {
        }
    }
}
