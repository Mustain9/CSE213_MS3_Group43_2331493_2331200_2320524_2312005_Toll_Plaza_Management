package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

public class TollRate {
    private  String vehicleType;
    private  Double oneWayRate;
    private  Double roundTripRate;
    private  Double monthlyRate;

    public TollRate(String vehicleType, Double oneWayRate, Double roundTripRate, Double monthlyRate) {
        this.vehicleType = vehicleType;
        this.oneWayRate = oneWayRate;
        this.roundTripRate = roundTripRate;
        this.monthlyRate = monthlyRate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getOneWayRate() {
        return oneWayRate;
    }

    public void setOneWayRate(Double oneWayRate) {
        this.oneWayRate = oneWayRate;
    }

    public Double getRoundTripRate() {
        return roundTripRate;
    }

    public void setRoundTripRate(Double roundTripRate) {
        this.roundTripRate = roundTripRate;
    }

    public Double getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(Double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }
}
