package com.ruoyi.iot.domain;

public class Blowdown {

    private String pid;

    private String monitortime;

    private String location;
    private String Hmental;
    private String ph;
    private String econdu;
    private String updatetime;
    @Override
    public String toString() {
        return "Blowdown{" +
                "pid='" + pid + '\'' +
                ", monitortime='" + monitortime + '\'' +
                ", location='" + location + '\'' +
                ", Hmental='" + Hmental + '\'' +
                ", ph='" + ph + '\'' +
                ", econdu='" + econdu + '\'' +
                ", updatetime='" + updatetime + '\'' +
                '}';
    }

    public Blowdown(String pid, String monitortime, String location, String Hmental, String ph, String econdu, String updatetime) {
            this.pid = pid;
            this.monitortime = monitortime;
            this.location = location;
            this.Hmental = Hmental;
            this.ph = ph;
            this.econdu = econdu;
            this.updatetime = updatetime;
        }
    public Blowdown() {
            super();
        }

            public String getPid() {
                return pid;
            }


                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getMonitortime() {
                    return monitortime;
                }
                public void setMonitortime(String monitortime) {
                    this.monitortime = monitortime;
                }
                public String getLocation() {
                    return location;
                }
                public void setLocation(String location) {
                    this.location = location;
                }
                public String getHmental() {
                    return Hmental;
                }
                public void setHmental(String Hmental) {
                    Hmental = Hmental;
                }
                public String getph() {
                    return ph;
                }
                public void setph(String ph) {
                    this.ph = ph;
                }
                public String getEcondu() {
                    return econdu;
                }
                public void setEcondu(String econdu) {
                    this.econdu = econdu;
                }
                public String getUpdatetime() {
                    return updatetime;
                }
                public void setUpdatetime(String updatetime) {
                    this.updatetime = updatetime;
                }
            }
