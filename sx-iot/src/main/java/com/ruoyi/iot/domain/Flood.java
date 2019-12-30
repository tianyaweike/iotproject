package com.ruoyi.iot.domain;

public class Flood {

    private String place_id;

    private String stage;

    private String display;

    private String rainfall;

    @Override
    public String toString() {
        return "Flood{" +
                "place_id='" + place_id + '\'' +
                ", stage='" + stage + '\'' +
                ", display='" + display + '\'' +
                ", rainfall='" + rainfall + '\'' +
                '}';
    }

    public Flood(String place_id, String stage, String display, String rainfall) {
        this.place_id = place_id;
        this.stage = stage;
        this.display = display;
        this.rainfall = rainfall;
    }

    public Flood() {
        super();
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getRainfall() {
        return rainfall;
    }

    public void setRainfall(String rainfall) {
        this.rainfall = rainfall;
    }
}