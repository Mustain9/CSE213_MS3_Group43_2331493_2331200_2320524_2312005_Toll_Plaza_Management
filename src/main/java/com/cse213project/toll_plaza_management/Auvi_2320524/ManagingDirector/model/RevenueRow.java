package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

public class RevenueRow {
    private String dateLabel;
    private Double totalIncome;
    private Double totalExpense;
    private Double balance;

    public RevenueRow() {
    }

    public RevenueRow(String dateLabel, Double totalIncome, Double totalExpense, Double balance) {
        this.dateLabel = dateLabel;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.balance = balance;
    }

    public String getDateLabel() {
        return dateLabel;
    }

    public void setDateLabel(String dateLabel) {
        this.dateLabel = dateLabel;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
