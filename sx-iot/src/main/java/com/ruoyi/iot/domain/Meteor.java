package com.ruoyi.iot.domain;

public class Meteor {

    private String weather_id;

    private String monitortime;

    private String location;
    private String windpower;
    private String winderaction;
    private String raincapacity;
    private String temperature;
    private String humidity;
    private String airlevel;
    private String updatetime;
    @Override
    public String toString() {
        return "Meteor{" +
                "weather_id='" + weather_id + '\'' +
                ", monitortime='" + monitortime + '\'' +
                ", location='" + location + '\'' +
                ", windpower='" + windpower + '\'' +
                ", winderaction='" + winderaction + '\'' +
                ", raincapacity='" + raincapacity + '\'' +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", airlevel='" + airlevel + '\'' +
                ", updatetime='" + updatetime + '\'' +
                '}';
    }

    public Meteor(String weather_id, String monitortime, String location, String windpower, String winderaction, String raincapacity, String temperature, String humidity, String airlevel, String updatetime) {
            this.weather_id = weather_id;
            this.monitortime = monitortime;
            this.location = location;
            this.windpower = windpower;
            this.winderaction = winderaction;
            this.raincapacity = raincapacity;
            this.temperature = temperature;
            this.humidity = humidity;
            this.airlevel = airlevel;
            this.updatetime = updatetime;
        }
    public Meteor() {
            super();
        }

            public String getWeather_id() {
                return weather_id;
            }


                public void setWeather_id(String weather_id) {
                    this.weather_id = weather_id;
                }

                public String getmonitortime() {
                    return monitortime;
                }
                public void setmonitortime(String monitortime) {
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
                public String gettemperature() {
                    return temperature;
                }
                public void settemperature(String temperature) {
                    this.temperature = temperature;
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
                public String getupdatetime() {
                    return updatetime;
                }
                public void setupdatetime(String updatetime) {
                    this.updatetime = updatetime;
                }
            }