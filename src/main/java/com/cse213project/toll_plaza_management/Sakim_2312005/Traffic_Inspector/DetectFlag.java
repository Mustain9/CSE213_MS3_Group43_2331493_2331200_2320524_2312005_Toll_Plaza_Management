package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

public class DetectFlag {
    private String booth;
    private String congestionresult;

    public DetectFlag() {
    }

    public DetectFlag(String booth, String congestionresult) {
        this.booth = booth;
        this.congestionresult = congestionresult;
    }

    public String getBooth() {
        return booth;
    }

    public void setBooth(String booth) {
        this.booth = booth;
    }

    public String getCongestionresult() {
        return congestionresult;
    }

    public void setCongestionresult(String congestionresult) {
        this.congestionresult = congestionresult;
    }

    @Override
    public String toString() {
        return "DetectFlag{" +
                "booth='" + booth + '\'' +
                ", congestionresult='" + congestionresult + '\'' +
                '}';
    }
}
