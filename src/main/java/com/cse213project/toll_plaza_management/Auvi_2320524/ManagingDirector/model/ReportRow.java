package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.io.Serializable;
import java.time.LocalDate;

public class ReportRow implements Serializable {
    private String reportId;
    private String decision;
    private LocalDate decisionDate;
    private String status;

    public ReportRow() {
    }

    public ReportRow(String reportId, String decision, LocalDate decisionDate, String status) {
        this.reportId = reportId;
        this.decision = decision;
        this.decisionDate = decisionDate;
        this.status = status;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(LocalDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
