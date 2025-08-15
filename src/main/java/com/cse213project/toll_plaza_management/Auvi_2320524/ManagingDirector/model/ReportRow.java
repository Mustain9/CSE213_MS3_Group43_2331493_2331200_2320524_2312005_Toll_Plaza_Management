package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.time.LocalDate;

public class ReportRow {
    private String reportId;
    private String type;
    private LocalDate date;
    private String status;

    public ReportRow() {
    }

    public ReportRow(String reportId, String type, LocalDate date, String status) {
        this.reportId = reportId;
        this.type = type;
        this.date = date;
        this.status = status;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
