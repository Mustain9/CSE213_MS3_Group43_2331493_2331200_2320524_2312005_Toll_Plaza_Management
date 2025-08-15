package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import java.time.LocalDate;

public class ActiveIssue {
    private String issueId;
    private String issueType;
    private LocalDate dateReported;
    private String location;

    public ActiveIssue() {

    }

    public ActiveIssue(String issueId, String issueType, LocalDate dateReported, String location) {
        this.issueId = issueId;
        this.issueType = issueType;
        this.dateReported = dateReported;
        this.location = location;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public LocalDate getDateReported() {
        return dateReported;
    }

    public void setDateReported(LocalDate dateReported) {
        this.dateReported = dateReported;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ActiveIssue{" +
                "issueId='" + issueId + '\'' +
                ", issueType='" + issueType + '\'' +
                ", dateReported=" + dateReported +
                ", location='" + location + '\'' +
                '}';
    }
}
