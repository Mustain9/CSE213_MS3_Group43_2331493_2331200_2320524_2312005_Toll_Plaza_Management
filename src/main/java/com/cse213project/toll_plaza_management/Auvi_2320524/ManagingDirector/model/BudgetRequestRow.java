package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.time.LocalDate;

public class BudgetRequestRow {
    private String requestId;
    private String department;
    private LocalDate date;
    private Double amountRequested;
    private String status;

    public BudgetRequestRow() {
    }

    public BudgetRequestRow(String requestId, String department, LocalDate date, Double amountRequested, String status) {
        this.requestId = requestId;
        this.department = department;
        this.date = date;
        this.amountRequested = amountRequested;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmountRequested() {
        return amountRequested;
    }

    public void setAmountRequested(Double amountRequested) {
        this.amountRequested = amountRequested;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
