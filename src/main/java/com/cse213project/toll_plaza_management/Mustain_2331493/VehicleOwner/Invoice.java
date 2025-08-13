package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

public class Invoice {
    private String invoiceID;
    private String date;
    private double tollAmount;
    private int noOfTrips;
    private String vehicleNumber;
    private String paymentMethod;

    public Invoice(String invoiceID, String date, double tollAmount, int noOfTrips, String vehicleNumber, String paymentMethod) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.tollAmount = tollAmount;
        this.noOfTrips = noOfTrips;
        this.vehicleNumber = vehicleNumber;
        this.paymentMethod = paymentMethod;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTollAmount() {
        return tollAmount;
    }

    public void setTollAmount(double tollAmount) {
        this.tollAmount = tollAmount;
    }

    public int getNoOfTrips() {
        return noOfTrips;
    }

    public void setNoOfTrips(int noOfTrips) {
        this.noOfTrips = noOfTrips;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
