package com.ruoyi.iot.domain;

public class Water {
    private String wid;

    private String type;

    private String area;

    private String temperature;

    private String color;

    private String turbidity;

    private String PH;

    private String electric;

    private String seston;

    private String oxygen;

    private String poison;

    private String creator;

    private String creatime;

    @Override
    public String toString() {
        return "Water{" +
                "wid='" + wid + '\'' +
                ", type='" + type + '\'' +
                ", area='" + area + '\'' +
                ", temperature='" + temperature + '\'' +
                ", color='" + color + '\'' +
                ", turbidity='" + turbidity + '\'' +
                ", PH='" + PH + '\'' +
                ", electric='" + electric + '\'' +
                ", seston='" + seston + '\'' +
                ", oxygen='" + oxygen + '\'' +
                ", poison='" + poison + '\'' +
                ", creator='" + creator + '\'' +
                ", creatime='" + creatime + '\'' +
                '}';
    }

    public Water(String wid, String type, String area, String temperature, String color, String turbidity, String PH, String electric, String seston, String oxygen, String poison, String creator, String creatime) {
        this.wid = wid;
        this.type = type;
        this.area = area;
        this.temperature = temperature;
        this.color = color;
        this.turbidity = turbidity;
        this.PH = PH;
        this.electric = electric;
        this.seston = seston;
        this.oxygen = oxygen;
        this.poison = poison;
        this.creator = creator;
        this.creatime = creatime;
    }

    public Water() {
        super();
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
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

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTurbidity() {
        return turbidity;
    }

    public void setTurbidity(String turbidity) {
        this.turbidity = turbidity;
    }

    public String getPH() {
        return PH;
    }

    public void setPH(String PH) {
        this.PH = PH;
    }

    public String getElectric() {
        return electric;
    }

    public void setElectric(String electric) {
        this.electric = electric;
    }

    public String getSeston() {
        return seston;
    }

    public void setSeston(String seston) {
        this.seston = seston;
    }

    public String getOxygen() {
        return oxygen;
    }

    public void setOxygen(String oxygen) {
        this.oxygen = oxygen;
    }

    public String getPoison() {
        return poison;
    }

    public void setPoison(String poison) {
        this.poison = poison;
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
