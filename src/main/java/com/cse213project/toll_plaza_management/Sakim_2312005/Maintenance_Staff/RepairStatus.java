package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

public class RepairStatus {
    private String issueId;
    private String currentStatus;

    public RepairStatus() {
    }

    public RepairStatus(String issueId, String currentStatus) {
        this.issueId = issueId;
        this.currentStatus = currentStatus;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "RepairStatus{" +
                "issueId='" + issueId + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                '}';
    }
}
