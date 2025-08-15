package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model;

import java.time.LocalDate;

public class MonthlyJournalEntry {
    private LocalDate date;
    private String description;
    private Double debit;
    private Double credit;
    private Double balance;

    public MonthlyJournalEntry() {
    }

    public MonthlyJournalEntry(LocalDate date, String description, Double debit, Double credit, Double balance) {
        this.date = date;
        this.description = description;
        this.debit = debit;
        this.credit = credit;
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDebit() {
        return debit;
    }

    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
