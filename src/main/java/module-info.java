module com.cse213project.cse213_ms3_group43_2331493_2331200_2320524_2312005_toll_plaza_management {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.pdfbox;
    requires org.apache.fontbox;

    opens com.cse213project.toll_plaza_management to javafx.fxml, javafx.graphics;
    opens com.cse213project.toll_plaza_management.common to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Sonda_2331200.Supervisor to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Sonda_2331200.Customer_Service_Agent to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff to javafx.fxml;


    exports com.cse213project.toll_plaza_management;
    exports com.cse213project.toll_plaza_management.common;
    exports com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;
    exports com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;
    exports com.cse213project.toll_plaza_management.Sonda_2331200.Supervisor;
    exports com.cse213project.toll_plaza_management.Sonda_2331200.Customer_Service_Agent;
    exports com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant;
    exports com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model;
    exports com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector;
    exports com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

}
