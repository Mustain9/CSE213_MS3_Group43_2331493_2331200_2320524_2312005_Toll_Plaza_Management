package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model;

public class EmployeePaymentRow {
    private String employeeId;
    private String name;
    private String designation;
    private String lastPaymentDate;
    private Double amountPaid;

    public EmployeePaymentRow() {
    }

    public EmployeePaymentRow(String employeeId, String name, String designation, String lastPaymentDate, Double amountPaid) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.lastPaymentDate = lastPaymentDate;
        this.amountPaid = amountPaid;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public void setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
