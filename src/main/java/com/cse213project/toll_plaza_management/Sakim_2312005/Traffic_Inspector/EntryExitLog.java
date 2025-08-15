package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

import java.time.LocalDate;

public class EntryExitLog {
    private int vehicleId;
    private String lane;
    private LocalDate TimeStamps;

    public EntryExitLog() {

    }

    public EntryExitLog(int vehicleId, String lane, LocalDate timeStamps) {
        this.vehicleId = vehicleId;
        this.lane = lane;
        TimeStamps = timeStamps;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public LocalDate getTimeStamps() {
        return TimeStamps;
    }

    public void setTimeStamps(LocalDate timeStamps) {
        TimeStamps = timeStamps;
    }

    @Override
    public String toString() {
        return "EntryExitLog{" +
                "vehicleId=" + vehicleId +
                ", lane='" + lane + '\'' +
                ", TimeStamps=" + TimeStamps +
                '}';
    }
}
