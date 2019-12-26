package com.ruoyi.iot.domain;

public class Fire {
    private String fid;

    private String Device_status;

    private String temperature;

    private String ppm;

    private String PM;

    private String current_sense;

    @Override
    public String toString() {
        return "Fire{" +
                "fid='" + fid + '\'' +
                ", Device_status='" + Device_status + '\'' +
                ", temperature='" + temperature + '\'' +
                ", ppm='" + ppm + '\'' +
                ", PM='" + PM + '\'' +
                ", current_sense='" + current_sense + '\'' +
                '}';
    }

    public Fire(String fid, String device_status, String temperature, String ppm, String PM, String current_sense) {
        this.fid = fid;
        Device_status = device_status;
        this.temperature = temperature;
        this.ppm = ppm;
        this.PM = PM;
        this.current_sense = current_sense;
    }

    public Fire() {
        super();
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getDevice_status() {
        return Device_status;
    }

    public void setDevice_status(String device_status) {
        Device_status = device_status;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getPpm() {
        return ppm;
    }

    public void setPpm(String ppm) {
        this.ppm = ppm;
    }

    public String getPM() {
        return PM;
    }

    public void setPM(String PM) {
        this.PM = PM;
    }

    public String getCurrent_sense() {
        return current_sense;
    }

    public void setCurrent_sense(String current_sense) {
        this.current_sense = current_sense;
    }
}
