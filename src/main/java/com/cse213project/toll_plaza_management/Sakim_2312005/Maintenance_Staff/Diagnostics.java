package com.cse213project.toll_plaza_management.Sakim_2312005.Maintenance_Staff;

public class Diagnostics {
    private String Diagnostics;
    private String Hardware;

    public Diagnostics() {
    }

    public Diagnostics(String diagnostics, String hardware) {
        Diagnostics = diagnostics;
        Hardware = hardware;
    }

    public String getDiagnostics() {
        return Diagnostics;
    }

    public void setDiagnostics(String diagnostics) {
        Diagnostics = diagnostics;
    }

    public String getHardware() {
        return Hardware;
    }

    public void setHardware(String hardware) {
        Hardware = hardware;
    }

    @Override
    public String toString() {
        return "Diagnostics{" +
                "Diagnostics='" + Diagnostics + '\'' +
                ", Hardware='" + Hardware + '\'' +
                '}';
    }
}
