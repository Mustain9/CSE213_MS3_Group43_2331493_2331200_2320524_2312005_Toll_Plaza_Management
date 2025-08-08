package com.cse213project.toll_plaza_management.Mustain_2331493.VehicleOwner;

public class Vehicle {
    private String name, email, vehicleNumber , vehicleType;
    private int phoneNumber;

    public Vehicle(String name, String email, String vehicleNumber, String vehicleType, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
