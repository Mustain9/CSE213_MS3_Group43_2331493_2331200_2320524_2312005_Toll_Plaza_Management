package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

public class TrafficViolation {
    private String vehicleId;
    private String violationType;
    private String notes;

    public TrafficViolation() {
    }

    public TrafficViolation(String vehicleId, String violationType, String notes) {
        this.vehicleId = vehicleId;
        this.violationType = violationType;
        this.notes = notes;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getViolationType() {
        return violationType;
    }

    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "TrafficViolation{" +
                "vehicleId='" + vehicleId + '\'' +
                ", violationType='" + violationType + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
