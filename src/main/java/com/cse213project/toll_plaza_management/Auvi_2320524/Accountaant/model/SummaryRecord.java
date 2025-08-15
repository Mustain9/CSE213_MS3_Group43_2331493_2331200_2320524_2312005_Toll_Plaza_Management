package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model;

import java.time.LocalDate;

public class SummaryRecord {
    private LocalDate date;
    private String type;
    private Double amount;
    private String description;

    public SummaryRecord() {
    }

    public SummaryRecord(LocalDate date, String type, Double amount, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.description = description;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
