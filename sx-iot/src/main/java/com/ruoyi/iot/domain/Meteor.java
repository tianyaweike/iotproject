package com.ruoyi.iot.domain;

public class Meteor {

    private String sid;

    private String monitortime;

    private String location;

    private String windpower;

    private String winderaction;

    private String raincapacity;

    private String temprature;

    private String humidity;

    private String airlevel;

    private String updatetime;

    @Override
    public String toString() {
        return "Meteor{" +
                "sid='" + sid + '\'' +
                ", monitortime='" + monitortime + '\'' +
                ", location='" + location + '\'' +
                ", windpower='" + windpower + '\'' +
                ", winderaction='" + winderaction + '\'' +
                ", raincapacity='" + raincapacity + '\'' +
                ", temprature='" + temprature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", airlevel='" + airlevel + '\'' +
                ", updatetime='" + updatetime + '\'' +
                '}';
    }

    public Meteor(String sid, String monitortime, String location, String windpower, String winderaction, String raincapacity, String temprature, String humidity, String airlevel, String updatetime) {
        this.sid = sid;
        this.monitortime = monitortime;
        this.location = location;
        this.windpower = windpower;
        this.winderaction = winderaction;
        this.raincapacity = raincapacity;
        this.temprature = temprature;
        this.humidity = humidity;
        this.airlevel = airlevel;
        this.updatetime = updatetime;
    }

    public Meteor() {
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

    public String getWindpower() {
        return windpower;
    }

    public void setWindpower(String windpower) {
        this.windpower = windpower;
    }

    public String getWinderaction() {
        return winderaction;
    }

    public void setWinderaction(String winderaction) {
        this.winderaction = winderaction;
    }

    public String getRaincapacity() {
        return raincapacity;
    }

    public void setRaincapacity(String raincapacity) {
        this.raincapacity = raincapacity;
    }

    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getAirlevel() {
        return airlevel;
    }

    public void setAirlevel(String airlevel) {
        this.airlevel = airlevel;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
