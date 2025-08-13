package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

public class MaintenanceReport {
    private String filePath;
    private String description;

    public MaintenanceReport() {
    }

    public MaintenanceReport(String filePath, String description) {
        this.filePath = filePath;
        this.description = description;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MaintenanceReport{" +
                "filePath='" + filePath + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
