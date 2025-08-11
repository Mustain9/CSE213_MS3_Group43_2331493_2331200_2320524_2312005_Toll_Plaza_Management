package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

public class Invoice {
    private String invoiceID;
    private String date;
    private String vehicleNumber;
    private double tollAmount;
    private String paymentMethod;

    public Invoice(String invoiceID, String date, String vehicleNumber, double tollAmount, String paymentMethod) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.vehicleNumber = vehicleNumber;
        this.tollAmount = tollAmount;
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

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double gettollAmountt() {
        return tollAmount;
    }

    public void settollAmount(double tollAmount) {
        this.tollAmount = tollAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
