package com.cse213project.toll_plaza_management.Mustain_2331493.TollCollector;

public class ShiftRecord {
    private  String vehicleNo;
    private  String vehicleType;
    private  String paymentMethod;
    private  Double tollAmount;
    private  String time;

    public ShiftRecord(String vehicleNo, String vehicleType, String paymentMethod, Double tollAmount, String time) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.paymentMethod = paymentMethod;
        this.tollAmount = tollAmount;
        this.time = time;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getTollAmount() {
        return tollAmount;
    }

    public void setTollAmount(Double tollAmount) {
        this.tollAmount = tollAmount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
