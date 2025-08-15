package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import java.time.LocalDate;

public class Equipment {
    private String slot;
    private String team;
    private LocalDate repairdate;

    public Equipment() {
    }

    public Equipment(String slot, String team, LocalDate repairdate) {
        this.slot = slot;
        this.team = team;
        this.repairdate = repairdate;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public LocalDate getRepairdate() {
        return repairdate;
    }

    public void setRepairdate(LocalDate repairdate) {
        this.repairdate = repairdate;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "slot='" + slot + '\'' +
                ", team='" + team + '\'' +
                ", repairdate=" + repairdate +
                '}';
    }
}
