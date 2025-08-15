package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.time.LocalDate;

public class PolicyRecord {
    private String title;
    private LocalDate date;
    private String description;
    private String action;

    public PolicyRecord() {
    }

    public PolicyRecord(String title, LocalDate date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.action = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
