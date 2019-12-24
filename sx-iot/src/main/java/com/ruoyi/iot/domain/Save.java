package com.ruoyi.iot.domain;

public class Save {

    private String info_id;

    private String user_adress;

    private String ray;

    private String warnstatus;

    @Override
    public String toString() {
        return "Save{" +
                "info_id='" + info_id + '\'' +
                ", user_adress='" + user_adress + '\'' +
                ", ray='" + ray + '\'' +
                ", warnstatus='" + warnstatus + '\'' +
                '}';
    }

    public Save(String info_id, String user_adress, String ray, String warnstatus) {
        this.info_id = info_id;
        this.user_adress = user_adress;
        this.ray = ray;
        this.warnstatus = warnstatus;
    }

    public Save() {
        super();
    }

    public String getInfo_id() {
        return info_id;
    }

    public void setInfo_id(String info_id) {
        this.info_id = info_id;
    }

    public String getUser_adress() {
        return user_adress;
    }

    public void setUser_adress(String user_adress) {
        this.user_adress = user_adress;
    }

    public String getRay() {
        return ray;
    }

    public void setRay(String ray) {
        this.ray = ray;
    }

    public String getWarnstatus() {
        return warnstatus;
    }

    public void setWarnstatus(String warnstatus) {
        this.warnstatus = warnstatus;
    }
}
