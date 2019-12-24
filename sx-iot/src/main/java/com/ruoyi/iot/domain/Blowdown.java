package com.ruoyi.iot.domain;

public class Blowdown {

    private String sid;

    private String monitortime;

    private String location;

    private String Hmental;

    private String PH;

    private String econdu;

    private String updatetime;

    @Override
    public String toString() {
        return "Blowdown{" +
                "sid='" + sid + '\'' +
                ", monitortime='" + monitortime + '\'' +
                ", location='" + location + '\'' +
                ", Hmental='" + Hmental + '\'' +
                ", PH='" + PH + '\'' +
                ", econdu='" + econdu + '\'' +
                ", updatetime='" + updatetime + '\'' +
                '}';
    }

    public Blowdown(String sid, String monitortime, String location, String hmental, String PH, String econdu, String updatetime) {
        this.sid = sid;
        this.monitortime = monitortime;
        this.location = location;
        Hmental = hmental;
        this.PH = PH;
        this.econdu = econdu;
        this.updatetime = updatetime;
    }

    public Blowdown() {
        super();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getMonitortime() {
        return monitortime;
    }

    public void setMonitortime(String monitortime) {
        this.monitortime = monitortime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHmental() {
        return Hmental;
    }

    public void setHmental(String hmental) {
        Hmental = hmental;
    }

    public String getPH() {
        return PH;
    }

    public void setPH(String PH) {
        this.PH = PH;
    }

    public String getEcondu() {
        return econdu;
    }

    public void setEcondu(String econdu) {
        this.econdu = econdu;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
