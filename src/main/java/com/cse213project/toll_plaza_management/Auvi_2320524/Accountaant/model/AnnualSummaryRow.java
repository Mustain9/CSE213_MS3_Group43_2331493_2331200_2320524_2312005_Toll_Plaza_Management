package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model;

public class AnnualSummaryRow {
    private final String month;
    private final double totalIncome;
    private final double totalExpense;
    private final double netCollection;

    public AnnualSummaryRow(String month, double totalIncome, double totalExpense, double netCollection) {
        this.month = month;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.netCollection = netCollection;
    }

    public String getMonth() {
        return month;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public double getNetCollection() {
        return netCollection;
    }
}