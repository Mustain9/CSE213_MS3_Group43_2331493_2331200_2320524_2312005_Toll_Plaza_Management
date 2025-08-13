package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

public class Notification {
    private String notificationId;
    private String issueSummary;
    private String report;

    public Notification() {
    }

    public Notification(String notificationId, String issueSummary, String report) {
        this.notificationId = notificationId;
        this.issueSummary = issueSummary;
        this.report = report;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getIssueSummary() {
        return issueSummary;
    }

    public void setIssueSummary(String issueSummary) {
        this.issueSummary = issueSummary;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", issueSummary='" + issueSummary + '\'' +
                ", report='" + report + '\'' +
                '}';
    }
}
