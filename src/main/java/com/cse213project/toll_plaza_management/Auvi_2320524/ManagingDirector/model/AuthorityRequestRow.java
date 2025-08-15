package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.time.LocalDate;

public class AuthorityRequestRow {
    private String requestId;
    private String type;
    private LocalDate date;
    private String status;

    public AuthorityRequestRow() {
    }

    public AuthorityRequestRow(String requestId, String type, LocalDate date, String status) {
        this.requestId = requestId;
        this.type = type;
        this.date = date;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
