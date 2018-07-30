package com.Info;

public class WareHouse {
    private Integer ware_id;
    private String ware_name;
    private String ware_location;

    public WareHouse(Integer ware_id, String ware_name, String ware_location) {
        this.ware_id = ware_id;
        this.ware_name = ware_name;
        this.ware_location = ware_location;
    }

    public Integer getWare_id() {
        return ware_id;
    }

    public void setWare_id(Integer ware_id) {
        this.ware_id = ware_id;
    }

    public String getWare_name() {
        return ware_name;
    }

    public void setWare_name(String ware_name) {
        this.ware_name = ware_name;
    }

    public String getWare_location() {
        return ware_location;
    }

    public void setWare_location(String ware_location) {
        this.ware_location = ware_location;
    }
}
