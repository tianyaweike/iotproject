package com.ruoyi.iot.domain;

public class Sandbox {

    private String switch_id;

    private String control;

    @Override
    public String toString() {
        return "Sandbox{" +
                "switch_id='" + switch_id + '\'' +
                ", control='" + control + '\'' +
                '}';
    }

    public Sandbox(String switch_id, String control) {
        this.switch_id = switch_id;
        this.control = control;
    }

    public Sandbox() {
        super();
    }

    public String getSwitch_id() {
        return switch_id;
    }

    public void setSwitch_id(String switch_id) {
        this.switch_id = switch_id;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }


}
