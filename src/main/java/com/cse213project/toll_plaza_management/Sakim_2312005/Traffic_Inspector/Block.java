package com.cse213project.toll_plaza_management.Sakim_2312005.Traffic_Inspector;

public class Block {
    private String lane ;
    private String Providereasonforblock ;

    public Block() {
    }

    public Block(String lane, String providereasonforblock) {
        this.lane = lane;
        Providereasonforblock = providereasonforblock;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getProvidereasonforblock() {
        return Providereasonforblock;
    }

    public void setProvidereasonforblock(String providereasonforblock) {
        Providereasonforblock = providereasonforblock;
    }

    @Override
    public String toString() {
        return "Block{" +
                "lane='" + lane + '\'' +
                ", Providereasonforblock='" + Providereasonforblock + '\'' +
                '}';
    }
}
