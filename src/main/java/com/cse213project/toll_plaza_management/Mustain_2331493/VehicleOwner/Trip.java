package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

import java.time.LocalDate;

public class Trip {
    private  String tripID;
    private  String vehicleNumber;
    private  String paymentMethod;
    private  Double tollAmount;
    private LocalDate date;

    public Trip(String tripID, String vehicleNumber, String paymentMethod, Double tollAmount, LocalDate date) {
        this.tripID = tripID;
        this.vehicleNumber = vehicleNumber;
        this.paymentMethod = paymentMethod;
        this.tollAmount = tollAmount;
        this.date = date;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNo) {
        this.vehicleNumber = vehicleNo;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
