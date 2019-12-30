package com.ruoyi.iot.domain;

public class Pump {

    private String id;

    private String tid;

    private String PCurrent;

    private String PVoltage;

    private String WLHeight;

    private String WLPressure;

    @Override
    public String toString() {
        return "Pump{" +
                "id='" + id + '\'' +
                ", tid='" + tid + '\'' +
                ", PCurrent='" + PCurrent + '\'' +
                ", PVoltage='" + PVoltage + '\'' +
                ", WLHeight='" + WLHeight + '\'' +
                ", WLPressure='" + WLPressure + '\'' +
                '}';
    }

    public Pump(String id, String tid, String PCurrent, String PVoltage, String WLHeight, String WLPressure) {
        this.id = id;
        this.tid = tid;
        this.PCurrent = PCurrent;
        this.PVoltage = PVoltage;
        this.WLHeight = WLHeight;
        this.WLPressure = WLPressure;
    }

    public Pump() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPCurrent() {
        return PCurrent;
    }

    public void setPCurrent(String PCurrent) {
        this.PCurrent = PCurrent;
    }

    public String getPVoltage() {
        return PVoltage;
    }

    public void setPVoltage(String PVoltage) {
        this.PVoltage = PVoltage;
    }

    public String getWLHeight() {
        return WLHeight;
    }

    public void setWLHeight(String WLHeight) {
        this.WLHeight = WLHeight;
    }

    public String getWLPressure() {
        return WLPressure;
    }

    public void setWLPressure(String WLPressure) {
        this.WLPressure = WLPressure;
    }
}
