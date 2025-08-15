package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

public class LiveAlert {
    private String Car, Bus, Truck, MiniBus;
    private String Alertnote;

    public LiveAlert() {
    }

    public LiveAlert(String car, String bus, String truck, String miniBus, String alertnote) {
        Car = car;
        Bus = bus;
        Truck = truck;
        MiniBus = miniBus;
        Alertnote = alertnote;
    }

    public String getCar() {
        return Car;
    }

    public void setCar(String car) {
        Car = car;
    }

    public String getBus() {
        return Bus;
    }

    public void setBus(String bus) {
        Bus = bus;
    }

    public String getTruck() {
        return Truck;
    }

    public void setTruck(String truck) {
        Truck = truck;
    }

    public String getMiniBus() {
        return MiniBus;
    }

    public void setMiniBus(String miniBus) {
        MiniBus = miniBus;
    }

    public String getAlertnote() {
        return Alertnote;
    }

    public void setAlertnote(String alertnote) {
        Alertnote = alertnote;
    }

    @Override
    public String toString() {
        return "LiveAlert{" +
                "Car='" + Car + '\'' +
                ", Bus='" + Bus + '\'' +
                ", Truck='" + Truck + '\'' +
                ", MiniBus='" + MiniBus + '\'' +
                ", Alertnote='" + Alertnote + '\'' +
                '}';
    }
}
