package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

public class TrafficVolume {
    private String direction;
    private String vehicleType;
    private int count;

    public TrafficVolume() {
    }

    public TrafficVolume(String direction, String vehicleType, int count) {
        this.direction = direction;
        this.vehicleType = vehicleType;
        this.count = count;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "TrafficVolume{" +
                "direction='" + direction + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", count=" + count +
                '}';
    }
}
