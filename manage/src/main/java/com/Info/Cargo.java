package com.Info;
//货物类
public class Cargo {
    private Integer cargo_id;
    private String cargo_name;

    public Cargo() {
    }

    public Cargo(Integer cargo_id, String cargo_name) {
        this.cargo_id = cargo_id;
        this.cargo_name = cargo_name;
    }

    public Integer getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(Integer cargo_id) {
        this.cargo_id = cargo_id;
    }

    public String getCargo_name() {
        return cargo_name;
    }

    public void setCargo_name(String cargo_name) {
        this.cargo_name = cargo_name;
    }


}
