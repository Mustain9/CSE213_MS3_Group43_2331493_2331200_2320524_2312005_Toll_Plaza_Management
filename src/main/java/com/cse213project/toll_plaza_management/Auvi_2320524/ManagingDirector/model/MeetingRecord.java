package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.time.LocalDate;

public class MeetingRecord {
    private LocalDate date;
    private String time;
    private String place;

    public MeetingRecord() {
    }

    public MeetingRecord(LocalDate date, String time, String place) {
        this.date = date;
        this.time = time;
        this.place = place;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
