package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.io.Serializable;
import java.time.LocalDate;

public class RevenueRow implements Serializable {
    private String reportType;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Double revenueAmount;

    public RevenueRow() {
    }

    public RevenueRow(String reportType, LocalDate fromDate, LocalDate toDate, Double revenueAmount) {
        this.reportType = reportType;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.revenueAmount = revenueAmount;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Double getRevenueAmount() {
        return revenueAmount;
    }

    public void setRevenueAmount(Double revenueAmount) {
        this.revenueAmount = revenueAmount;
    }
}
