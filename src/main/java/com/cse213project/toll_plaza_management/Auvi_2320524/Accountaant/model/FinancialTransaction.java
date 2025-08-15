package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model;

import java.time.LocalDate;

public class FinancialTransaction {
    private LocalDate date;
    private String type;
    private String description;
    private Double amount;
    private String invoicePath;

    public FinancialTransaction() {
    }

    public FinancialTransaction(LocalDate date, String type, String description, Double amount, String invoicePath) {
        this.date = date;
        this.type = type;
        this.description = description;
        this.amount = amount;
        this.invoicePath = invoicePath;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getInvoicePath() {
        return invoicePath;
    }

    public void setInvoicePath(String invoicePath) {
        this.invoicePath = invoicePath;
    }
}
