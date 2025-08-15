package com.cse213project.toll_plaza_management.Auvi_2320524.Accountaant.model;

public class ShiftReportRow {
    private String boothNo;
    private String vehicleType;
    private Integer count;
    private Double totalCollection;

    public ShiftReportRow() {
    }

    public ShiftReportRow(String boothNo, String vehicleType, Integer count, Double totalCollection) {
        this.boothNo = boothNo;
        this.vehicleType = vehicleType;
        this.count = count;
        this.totalCollection = totalCollection;
    }

    public String getBoothNo() {
        return boothNo;
    }

    public void setBoothNo(String boothNo) {
        this.boothNo = boothNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getTotalCollection() {
        return totalCollection;
    }

    public void setTotalCollection(Double totalCollection) {
        this.totalCollection = totalCollection;
    }
}
