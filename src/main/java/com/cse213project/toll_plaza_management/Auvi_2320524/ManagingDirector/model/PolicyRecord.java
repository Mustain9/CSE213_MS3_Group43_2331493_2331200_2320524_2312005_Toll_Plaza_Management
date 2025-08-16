package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.io.Serializable;
import java.time.LocalDate;

public class PolicyRecord implements Serializable {
    private String policyTitle;
    private String description;
    private LocalDate effectiveDate;
    private String status;

    public PolicyRecord() {
    }

    public PolicyRecord(String policyTitle, String description, LocalDate effectiveDate, String status) {
        this.policyTitle = policyTitle;
        this.description = description;
        this.effectiveDate = effectiveDate;
        this.status = status;
    }

    public String getPolicyTitle() {
        return policyTitle;
    }

    public void setPolicyTitle(String policyTitle) {
        this.policyTitle = policyTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
