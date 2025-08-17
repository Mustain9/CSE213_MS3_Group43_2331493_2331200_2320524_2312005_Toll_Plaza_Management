package com.cse213project.toll_plaza_management.Sonda_2331200.Supervisor;

public class Complaint {
    private String complaintID;
    private String name;
    private String problem;
    private String agent;
    private String status;
    private String date;

    public Complaint(String complaintID, String name, String problem, String agent, String status, String date) {
        this.complaintID = complaintID;
        this.name = name;
        this.problem = problem;
        this.agent = agent;
        this.status = status;
        this.date = date;
    }

    public String getComplaintID() {
        return complaintID;
    }

    public void setComplaintID(String complaintID) {
        this.complaintID = complaintID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintID='" + complaintID + '\'' +
                ", name='" + name + '\'' +
                ", problem='" + problem + '\'' +
                ", agent='" + agent + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}
