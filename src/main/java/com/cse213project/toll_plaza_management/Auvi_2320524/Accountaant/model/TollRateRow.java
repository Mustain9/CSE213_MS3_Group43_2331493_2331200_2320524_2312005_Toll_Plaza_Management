package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model;

public class TollRateRow {
    private String category;
    private Double currentRate;
    private String lastUpdated;

    public TollRateRow() {
    }

    public TollRateRow(String category, Double currentRate, String lastUpdated) {
        this.category = category;
        this.currentRate = currentRate;
        this.lastUpdated = lastUpdated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(Double currentRate) {
        this.currentRate = currentRate;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
