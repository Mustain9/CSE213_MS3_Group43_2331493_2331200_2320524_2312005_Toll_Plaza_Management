module com.cse213project.cse213_ms3_group43_2331493_2331200_2320524_2312005_toll_plaza_management {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cse213project.toll_plaza_management to javafx.fxml, javafx.graphics;
    opens com.cse213project.toll_plaza_management.common to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner to javafx.fxml;
    opens com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector to javafx.fxml;

    exports com.cse213project.toll_plaza_management;
    exports com.cse213project.toll_plaza_management.common;
    exports com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;
    exports com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;
}
