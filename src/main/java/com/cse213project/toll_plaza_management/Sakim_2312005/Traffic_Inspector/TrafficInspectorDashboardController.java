package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class TrafficInspectorDashboardController
{
    private EventObject event;

    @javafx.fxml.FXML
    public void initialize() {
    }
    private Parent root;
    private Stage stage;
    private Scene scene;


    @javafx.fxml.FXML
    public void detectandflagcongestionOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/detectandflag.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Detect And Flag Congestion");
        stage.show();
    }

    @javafx.fxml.FXML
    public void communicatewithboothoperatorsorsupervisorsOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/communicatewithbooth.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Communicate With Booth Operators Or Supervisor");
        stage.show();
    }

    @javafx.fxml.FXML
    public void temporarilyblocktolllanesforemergenciesOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/TemporaryBlock.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Temporarily Block Toll Lanes For Emergencies");
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewentryandexitlogsofvehiclesOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/viewentryandexit.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View Entry And Exit Logs Of Vehicles");
        stage.show();

    }

    @javafx.fxml.FXML
    public void receivelivealertsofincidentOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/recieveliveallerts.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Receive Live Alerts of Incident");
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewTrafficVolumeAcrossTollLanesOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/viewtrafficvolume.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("View Traffic Volume Across Toll Lanes");
        stage.show();
    }

    @javafx.fxml.FXML
    public void exportdailytrafficandincidentreportOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/ExportDailyTraffic.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Export Daily Traffic Incident Report");
        stage.show();
    }

    @javafx.fxml.FXML
    public void logtrafficviolationsOnaction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/Sakim_2312005/Traffic_Inspector/logtrafficviolations.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Log Traffic Violations");
        stage.show();
    }

    @javafx.fxml.FXML
    public void signOutOnaction(ActionEvent actionEvent) throws IOException {
        //loadLogInPage(event, "com/cse213project/toll_plaza_management/common/login.fxml" , "Toll Plaza Login");
        Parent root = FXMLLoader.load(getClass().getResource("/com/cse213project/toll_plaza_management/common/login.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
    }
//    private void loadLogInPage(ActionEvent event, String fxmlPath, String title) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.setScene(new Scene(root));
//        stage.setTitle(title);
//        stage.show();
//    }
}