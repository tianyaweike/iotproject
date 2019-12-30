package com.ruoyi.iot.domain;

public class Broad {

    private String broad_id;

    private String address;

    private String statue;

    private String runtime;

    private String details;

    @Override
    public String toString() {
        return "Broad{" +
                "broad_id='" + broad_id + '\'' +
                ", address='" + address + '\'' +
                ", statue='" + statue + '\'' +
                ", runtime='" + runtime + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public Broad(String broad_id, String address, String statue, String runtime, String details) {
        this.broad_id = broad_id;
        this.address = address;
        this.statue = statue;
        this.runtime = runtime;
        this.details = details;
    }

    public Broad() {
        super();
    }

    public String getBroad_id() {
        return broad_id;
    }

    public void setBroad_id(String broad_id) {
        this.broad_id = broad_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
