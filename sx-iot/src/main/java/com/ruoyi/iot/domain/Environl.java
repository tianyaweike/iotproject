package com.ruoyi.iot.domain;

public class Environl {
    private String Ambient_temperature;

    private String ambient_humidity;

    private String wind_speed;

    private String wind_direction;

    private String Light_intensity;

    private String atmospheric;

    private String PM;

    private String ppm;

    private String Device_status;

    @Override
    public String toString() {
        return "Environl{" +
                "Ambient_temperature='" + Ambient_temperature + '\'' +
                ", ambient_humidity='" + ambient_humidity + '\'' +
                ", wind_speed='" + wind_speed + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", Light_intensity='" + Light_intensity + '\'' +
                ", atmospheric='" + atmospheric + '\'' +
                ", PM='" + PM + '\'' +
                ", ppm='" + ppm + '\'' +
                ", Device_status='" + Device_status + '\'' +
                '}';
    }

    public Environl(String ambient_temperature, String ambient_humidity, String wind_speed, String wind_direction, String light_intensity, String atmospheric, String PM, String ppm, String device_status) {
        Ambient_temperature = ambient_temperature;
        this.ambient_humidity = ambient_humidity;
        this.wind_speed = wind_speed;
        this.wind_direction = wind_direction;
        Light_intensity = light_intensity;
        this.atmospheric = atmospheric;
        this.PM = PM;
        this.ppm = ppm;
        Device_status = device_status;
    }

    public Environl() {
        super();
    }

    public String getAmbient_temperature() {
        return Ambient_temperature;
    }

    public void setAmbient_temperature(String ambient_temperature) {
        Ambient_temperature = ambient_temperature;
    }

    public String getAmbient_humidity() {
        return ambient_humidity;
    }

    public void setAmbient_humidity(String ambient_humidity) {
        this.ambient_humidity = ambient_humidity;
    }

    public String getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getLight_intensity() {
        return Light_intensity;
    }

    public void setLight_intensity(String light_intensity) {
        Light_intensity = light_intensity;
    }

    public String getAtmospheric() {
        return atmospheric;
    }

    public void setAtmospheric(String atmospheric) {
        this.atmospheric = atmospheric;
    }

    public String getPM() {
        return PM;
    }

    public void setPM(String PM) {
        this.PM = PM;
    }

    public String getPpm() {
        return ppm;
    }

    public void setPpm(String ppm) {
        this.ppm = ppm;
    }

    public String getDevice_status() {
        return Device_status;
    }

    public void setDevice_status(String device_status) {
        Device_status = device_status;
    }
}
