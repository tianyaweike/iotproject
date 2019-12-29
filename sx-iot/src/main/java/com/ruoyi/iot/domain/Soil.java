package com.ruoyi.iot.domain;

import java.util.Date;

public class Soil {

    private String sid;

    private String type;

    private String area;

    private String depth;

    private String PH;

    private String water;

    private String salinity;

    private String organic;

    private String creator;

    private String creatime;

    @Override
    public String toString() {
        return "Soil{" +
                "sid='" + sid + '\'' +
                ", type='" + type + '\'' +
                ", area='" + area + '\'' +
                ", depth='" + depth + '\'' +
                ", PH='" + PH + '\'' +
                ", water='" + water + '\'' +
                ", sailnity='" + salinity + '\'' +
                ", organic='" + organic + '\'' +
                ", creator='" + creator + '\'' +
                ", creatime='" + creatime + '\'' +
                '}';
    }

    public Soil(String sid, String type, String area, String depth, String PH, String water, String sailnity, String organic, String creator, String creatime) {
        this.sid = sid;
        this.type = type;
        this.area = area;
        this.depth = depth;
        this.PH = PH;
        this.water = water;
        this.salinity = sailnity;
        this.organic = organic;
        this.creator = creator;
        this.creatime = creatime;
    }

    public Soil() {
        super();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getPH() {
        return PH;
    }

    public void setPH(String PH) {
        this.PH = PH;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSailnity() {
        return salinity;
    }

    public void setSailnity(String sailnity) {
        this.salinity = sailnity;
    }

    public String getOrganic() {
        return organic;
    }

    public void setOrganic(String organic) {
        this.organic = organic;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatime() {
        return creatime;
    }

    public void setCreatime(String creatime) {
        this.creatime = creatime;
    }
}