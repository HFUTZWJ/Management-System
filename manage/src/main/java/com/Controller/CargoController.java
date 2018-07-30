package com.Controller;

import com.Info.Cargo;
import com.MapperR.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CargoController {
    @Autowired
    private Mapper mapper;
    private Cargo cargo = new Cargo(1006, "HELLO");

    @RequestMapping(value = {"/find"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)

    public List getAllUsers() {
        return mapper.getCargoList();
        //return "hello";
    }

    @RequestMapping(value = {"/add"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int add() {
        return mapper.add(cargo);
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int update() {
        System.out.println("update.....");
        return mapper.update("zhou",1006);
    }

    @RequestMapping(value = {"/delete"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int delete() {
        return mapper.delete(cargo.getCargo_id());
    }
}
