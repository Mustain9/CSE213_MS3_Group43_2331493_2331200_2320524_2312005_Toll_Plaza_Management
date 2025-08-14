package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

public class ExportDaily {
    private String Range;
    private String Booth;
    private String Report;

    public ExportDaily() {
    }

    public ExportDaily(String range, String booth, String report) {
        Range = range;
        Booth = booth;
        Report = report;
    }

    public String getRange() {
        return Range;
    }

    public void setRange(String range) {
        Range = range;
    }

    public String getBooth() {
        return Booth;
    }

    public void setBooth(String booth) {
        Booth = booth;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String report) {
        Report = report;
    }

    @Override
    public String toString() {
        return "ExportDaily{" +
                "Range='" + Range + '\'' +
                ", Booth='" + Booth + '\'' +
                ", Report='" + Report + '\'' +
                '}';
    }
}
