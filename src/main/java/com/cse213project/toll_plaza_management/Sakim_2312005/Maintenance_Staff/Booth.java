package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

public class Booth {
    private String report;
    private String category;

    public Booth() {
    }

    public Booth(String report, String category) {
        this.report = report;
        this.category = category;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Booth{" +
                "report='" + report + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
