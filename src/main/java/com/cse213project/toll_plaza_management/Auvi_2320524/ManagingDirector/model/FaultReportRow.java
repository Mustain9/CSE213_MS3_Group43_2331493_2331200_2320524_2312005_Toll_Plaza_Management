package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.time.LocalDate;

public class FaultReportRow {
    private String faultId;
    private String equipmentType;
    private LocalDate reportDate;
    private String severity;
    private String status;

    public FaultReportRow() {
    }

    public FaultReportRow(String faultId, String equipmentType, LocalDate reportDate, String severity, String status) {
        this.faultId = faultId;
        this.equipmentType = equipmentType;
        this.reportDate = reportDate;
        this.severity = severity;
        this.status = status;
    }

    public String getFaultId() {
        return faultId;
    }

    public void setFaultId(String faultId) {
        this.faultId = faultId;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
