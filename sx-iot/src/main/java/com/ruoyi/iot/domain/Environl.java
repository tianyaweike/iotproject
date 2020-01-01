package com.ruoyi.iot.domain;

public class Environl {
    private String hid;

    private String ambient_temperature;

    private String ambient_humidity;
    private String wind_speed;
    private String wind_direction;
    private String light_intensity;
    private String atmospheric_pressure;
    private String pm;
    private String ppm;
    private String device_status;
    @Override
    public String toString() {
        return "Environl{" +
                "hid='" + hid + '\'' +
                ", ambient_temperature='" + ambient_temperature + '\'' +
                ", ambient_humidity='" + ambient_humidity + '\'' +
                ", wind_speed='" + wind_speed + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", light_intensity='" + light_intensity + '\'' +
                ", atmospheric_pressure='" + atmospheric_pressure + '\'' +
                ", pm='" + pm + '\'' +
                ", ppm='" + ppm + '\'' +
                ", device_status='" + device_status + '\'' +
                '}';
    }

    public Environl(String hid, String ambient_temperature, String ambient_humidity, String wind_speed, String wind_direction, String light_intensity, String atmospheric_pressure, String pm, String ppm, String device_status) {
        this.hid = hid;
        this.ambient_temperature = ambient_temperature;
        this.ambient_humidity = ambient_humidity;
        this.wind_speed = wind_speed;
        this.wind_direction = wind_direction;
        this.light_intensity = light_intensity;
        this.atmospheric_pressure = atmospheric_pressure;
        this.pm = pm;
        this.ppm = ppm;
        this.device_status = device_status;
    }
    public Environl() {
        super();
    }

    public String gethid() {
        return hid;
    }

    public void sethid(String hid) {
        this.hid = hid;
    }

    public String getambient_temperature() {
        return ambient_temperature;
    }
    public void setambient_temperature(String ambient_temperature) {
        this.ambient_temperature = ambient_temperature;
    }
    public String getambient_humidity() {
        return ambient_humidity;
    }
    public void setambient_humidity(String ambient_humidity) {
        this.ambient_humidity = ambient_humidity;
    }
    public String getwind_speed() {
        return wind_speed;
    }
    public void setwind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }
    public String getWind_direction() {
        return wind_direction;
    }
    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }
    public String getlight_intensity() {
        return light_intensity;
    }
    public void setlight_intensity(String light_intensity) {
        this.light_intensity = light_intensity;
    }
    public String getatmospheric_pressure() {
        return atmospheric_pressure;
    }
    public void setatmospheric_pressure(String atmospheric_pressure) {
        this.atmospheric_pressure = atmospheric_pressure;
    }
    public String getpm() {
        return pm;
    }
    public void setpm(String pm) {
        this.pm = pm;
    }
    public String getppm() {
        return ppm;
    }
    public void setppm(String ppm) {
        this.ppm = ppm;
    }
    public String getdevice_status() {
        return device_status;
    }
    public void setdevice_status(String device_status) {
        this.device_status = device_status;
    }
}