package com.ruoyi.iot.domain;

import com.ruoyi.common.annotation.Excel;

public class Pump {
    @Excel(name="序号")
    private String id;
    @Excel(name="型号")
    private String tid;
    @Excel(name="水泵电流")
    private String pcurrent;
    @Excel(name="水泵电压")
    private String pvoltage;
    @Excel(name="水位高度")
    private String wlheight;
    @Excel(name="水位压力")
    private String wlpressure;

    @Override
    public String toString() {
        return "Pump{" +
                "id='" + id + '\'' +
                ", tid='" + tid + '\'' +
                ", pcurrent='" + pcurrent + '\'' +
                ", pvoltage='" + pvoltage + '\'' +
                ", wlheight='" + wlheight + '\'' +
                ", wlpressure='" + wlpressure + '\'' +
                '}';
    }

    public Pump(String id, String tid, String pcurrent, String pvoltage, String wlheight, String wlpressure) {
        this.id = id;
        this.tid = tid;
        this.pcurrent = pcurrent;
        this.pvoltage = pvoltage;
        this.wlheight = wlheight;
        this.wlpressure = wlpressure;
    }

    public Pump() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPcurrent() {
        return pcurrent;
    }

    public void setPcurrent(String pcurrent) {
        this.pcurrent = pcurrent;
    }

    public String getPvoltage() {
        return pvoltage;
    }

    public void setPvoltage(String pvoltage) {
        this.pvoltage = pvoltage;
    }

    public String getWlheight() {
        return wlheight;
    }

    public void setWlheight(String wlheight) {
        this.wlheight = wlheight;
    }

    public String getWlpressure() {
        return wlpressure;
    }

    public void setWlpressure(String wlpressure) {
        this.wlpressure = wlpressure;
    }
}
