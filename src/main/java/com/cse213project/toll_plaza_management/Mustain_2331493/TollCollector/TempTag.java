package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

import java.time.LocalDate;

public class TempTag {
    private String tagID;
    private String vehicleNumber;
    private LocalDate expiryDate;

    public TempTag(String tagID, String vehicleNumber, LocalDate expiryDate) {
        this.tagID = tagID;
        this.vehicleNumber = vehicleNumber;
        this.expiryDate = expiryDate;
    }

    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
