package com.cse213project.toll_plaza_management.Auvi_2320524.ManagingDirector.model;

import java.io.Serializable;
import java.time.LocalDate;

public class MeetingRecord implements Serializable {
    private LocalDate meetingDate;
    private String time;
    private String place;
    private String status;

    public MeetingRecord() {
    }

    public MeetingRecord(LocalDate meetingDate, String time, String place, String status) {
        this.meetingDate = meetingDate;
        this.time = time;
        this.place = place;
        this.status = status;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
