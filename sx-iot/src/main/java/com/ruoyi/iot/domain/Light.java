package com.ruoyi.iot.domain;

public class Light {

    private String nid;

    private String atemperature;

    private String windspeed;

    private String current;

    private String voltage;

    @Override
    public String toString() {
        return "Light{" +
                "nid='" + nid + '\'' +
                ", atemperature='" + atemperature + '\'' +
                ", windspeed='" + windspeed + '\'' +
                ", current='" + current + '\'' +
                ", voltage='" + voltage + '\'' +
                '}';
    }

    public Light(String nid, String atemperature, String windspeed, String current, String voltage) {
        this.nid = nid;
        this.atemperature = atemperature;
        this.windspeed = windspeed;
        this.current = current;
        this.voltage = voltage;
    }

    public Light() {
        super();
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getAtemperature() {
        return atemperature;
    }

    public void setAtemperature(String atemperature) {
        this.atemperature = atemperature;
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }
}
