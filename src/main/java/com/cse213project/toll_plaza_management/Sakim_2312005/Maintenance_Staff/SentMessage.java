package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

import java.time.LocalDate;

public class SentMessage {
    private String messageId;
    private String status;
    private LocalDate date;

    public SentMessage() {
    }

    public SentMessage(String messageId, String status, LocalDate date) {
        this.messageId = messageId;
        this.status = status;
        this.date = date;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SentMessage{" +
                "messageId='" + messageId + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
