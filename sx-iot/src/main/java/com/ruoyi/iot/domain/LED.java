/*
package com.ruoyi.iot.domain;

public class LED {

    private String Led_id;

    private String led_Status;

    private String led_Bright;


    private String screen_wide;

    private String screen_high;


    private String screen_status;

    public String toString() {
        return "LED{" +
                "led_id='" + Led_id + '\'' +
                ", led_status='" + led_Status + '\'' +
                ", led_bright='" + led_Bright + '\'' +
                ", screen_wide='" + screen_wide + '\'' +
                ", screen_high='" + screen_high + '\'' +
                ", screen_status='" + screen_status + '\'' +
                '}';
    }



    public LED(String Led_id, String led_Status, String led_Bright, String screen_wide,String screen_high, String screen_status) {
        this.Led_id = Led_id;
        this.led_Status = led_Status;
        this.led_Bright = led_Bright;
        this.screen_wide = screen_wide;
        this.screen_high = screen_high;
        this.screen_status = screen_status;
    }

    public LED() {
        super();
    }

    public String Led_id() {
        return Led_id;
    }

    public void setLed_id(String led_id) {
        this.Led_id = led_id;
    }

    public String led_Status() {
        return led_Status;
    }

    public void setled_Status(String led_status) {
        this.led_Status = led_status;
    }

    public String getLed_bright() {
        return led_Bright;
    }

    public void setLed_bright(String led_bright) {
        this.led_Bright = led_bright;
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
}*/
package com.ruoyi.iot.domain;

import com.ruoyi.common.annotation.Excel;

public class LED {
    @Excel(name = "灯编号")
    private String Led_id;
    @Excel(name = "灯状态" ,readConverterExp = "0=停用,1=正常")
    private String led_Status;
    @Excel(name = "灯亮度")
    private String led_Bright;
    @Excel(name = "屏幕宽度")
    private String screen_wide;
    @Excel(name = "屏幕高度")
    private String screen_high;
    @Excel(name = "屏幕状态",readConverterExp = "0=停用,1=正常")
    private String screen_status;

    public String getLed_id() {
        return Led_id;
    }

    public void setLed_id(String led_id) {
        this.Led_id = led_id;
    }

    public String getLed_status() {
        return led_Status;
    }

    public void setLed_status(String led_status) {
        this.led_Status = led_status;
    }

    public String getLed_bright() {
        return led_Bright;
    }

    public void setLed_bright(String led_bright) {
        this.led_Bright = led_bright;
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
                "led_id='" + Led_id + '\'' +
                ", led_status='" + led_Status + '\'' +
                ", led_bright='" + led_Bright + '\'' +
                ", screen_wide='" + screen_wide + '\'' +
                ", screen_high='" + screen_high + '\'' +
                ", screen_status='" + screen_status + '\'' +
                '}';
    }
    public LED(String Led_id, String led_Status, String led_Bright, String screen_wide, String screen_high,String screen_status) {
        this.Led_id = Led_id;
        this.led_Status = led_Status;
        this.led_Bright = led_Bright;
        this.screen_wide = screen_wide;
        this.screen_high = screen_high;
        this.screen_status= screen_status;
    }
}