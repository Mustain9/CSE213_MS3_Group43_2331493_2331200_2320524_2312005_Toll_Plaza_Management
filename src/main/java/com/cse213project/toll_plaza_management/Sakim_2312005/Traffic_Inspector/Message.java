package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

public class Message {
    private String selectrecipient;
    private String messageinput;
    private String messagehistoryTa;

    public Message() {
    }

    public Message(String selectrecipient, String messageinput, String messagehistoryTa) {
        this.selectrecipient = selectrecipient;
        this.messageinput = messageinput;
        this.messagehistoryTa = messagehistoryTa;
    }

    public String getSelectrecipient() {
        return selectrecipient;
    }

    public void setSelectrecipient(String selectrecipient) {
        this.selectrecipient = selectrecipient;
    }

    public String getMessageinput() {
        return messageinput;
    }

    public void setMessageinput(String messageinput) {
        this.messageinput = messageinput;
    }

    public String getMessagehistoryTa() {
        return messagehistoryTa;
    }

    public void setMessagehistoryTa(String messagehistoryTa) {
        this.messagehistoryTa = messagehistoryTa;
    }

    @Override
    public String toString() {
        return "Message{" +
                "selectrecipient='" + selectrecipient + '\'' +
                ", messageinput='" + messageinput + '\'' +
                ", messagehistoryTa='" + messagehistoryTa + '\'' +
                '}';
    }
}
