module com.cse213project.cse213_ms3_group43_2331493_2331200_2320524_2312005_toll_plaza_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213project.toll_plaza_management to javafx.fxml;
    exports com.cse213project.toll_plaza_management;
}