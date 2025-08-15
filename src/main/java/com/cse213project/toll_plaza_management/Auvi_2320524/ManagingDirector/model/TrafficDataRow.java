package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

public class TrafficDataRow {
    private String timeSlot;
    private Integer vehicleCount;
    private String peakStatus;
    private String laneUsage;

    public TrafficDataRow() {
    }

    public TrafficDataRow(String timeSlot, Integer vehicleCount, String peakStatus, String laneUsage) {
        this.timeSlot = timeSlot;
        this.vehicleCount = vehicleCount;
        this.peakStatus = peakStatus;
        this.laneUsage = laneUsage;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Integer getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(Integer vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public String getPeakStatus() {
        return peakStatus;
    }

    public void setPeakStatus(String peakStatus) {
        this.peakStatus = peakStatus;
    }

    public String getLaneUsage() {
        return laneUsage;
    }

    public void setLaneUsage(String laneUsage) {
        this.laneUsage = laneUsage;
    }
}
