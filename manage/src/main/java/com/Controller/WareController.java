package com.Controller;

import com.Service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WareController {
    @Autowired
    private WareService wareService;
    @RequestMapping(value = {"/findWare"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public List getAllUsers() {
        return wareService.getAllWare();
    }

    @RequestMapping(value = {"/addWare"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int add() {
        return wareService.add();
    }

    @RequestMapping(value = {"/updateWare"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int update() {
        return wareService.update();
    }

    @RequestMapping(value = {"/deleteWare"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int delete() {
        return wareService.delete();
    }
}
