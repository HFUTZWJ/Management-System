package com.Info;

public class Sku {
    private Integer sku_id;
    private String sku_name;
    private Integer ware_id;
    private Integer cargo_id;

    public Sku() {
    }

    public Integer getSku_id() {
        return sku_id;
    }

    public void setSku_id(Integer sku_id) {
        this.sku_id = sku_id;
    }

    public String getSku_name() {
        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name;
    }

    public Integer getWare_id() {
        return ware_id;
    }

    public void setWare_id(Integer ware_id) {
        this.ware_id = ware_id;
    }

    public Integer getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(Integer cargo_id) {
        this.cargo_id = cargo_id;
    }

    public Sku(Integer sku_id, String sku_name, Integer ware_id, Integer cargo_id) {
        this.sku_id = sku_id;
        this.sku_name = sku_name;
        this.ware_id = ware_id;
        this.cargo_id = cargo_id;
    }
}
