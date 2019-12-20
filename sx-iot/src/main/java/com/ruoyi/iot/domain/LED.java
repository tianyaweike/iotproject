package com.ruoyi.iot.domain;

public class LED {
    private String led_id;

    private String led_status;

    private String led_bright;

    private String screen_wide;

    private String screen_high;

    private String screen_status;

    public String getLed_id() {
        return led_id;
    }

    public void setLed_id(String led_id) {
        this.led_id = led_id;
    }

    public String getLed_status() {
        return led_status;
    }

    public void setLed_status(String led_status) {
        this.led_status = led_status;
    }

    public String getLed_bright() {
        return led_bright;
    }

    public void setLed_bright(String led_bright) {
        this.led_bright = led_bright;
    }

    public String getScreen_wide() {
        return screen_wide;
    }

    public void setScreen_wide(String screen_wide) {
        this.screen_wide = screen_wide;
    }

    public String getScreen_high() {
        return screen_high;
    }

    public void setScreen_high(String screen_high) {
        this.screen_high = screen_high;
    }

    public String getScreen_status() {
        return screen_status;
    }

    public void setScreen_status(String screen_status) {
        this.screen_status = screen_status;
    }

    @Override
    public String toString() {
        return "LED{" +
                "led_id='" + led_id + '\'' +
                ", led_status='" + led_status + '\'' +
                ", led_bright='" + led_bright + '\'' +
                ", screen_wide='" + screen_wide + '\'' +
                ", screen_high='" + screen_high + '\'' +
                ", screen_status='" + screen_status + '\'' +
                '}';
    }
}
