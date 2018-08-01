package com.Controller;

import com.Info.Cargo;
import com.Service.CargoService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class CargoController {
    @Autowired
    private CargoService cargoService;

    @RequestMapping(value = {"/find"}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public String get()
    {
        List<Cargo> cargoList = cargoService.getAllCargo();
        System.out.println(cargoList);
        JSONArray json = new JSONArray();
        for(Cargo c:cargoList){
            JSONObject jo = new JSONObject();
            jo.put("id",c.getCargo_id());
            jo.put("name",c.getCargo_name());
            json.add(jo);
        }
        System.out.println(json);
        return json.toString();
    }


    @RequestMapping(value = {"/update"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int update(@RequestParam("cargo_id") Integer cargo_id,@RequestParam("cargo_name") String cargo_name) {
        return cargoService.update(cargo_id,cargo_name);
    }

    @RequestMapping(value = {"/delete"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public void delete(@RequestParam("cargo_id") Integer cargo_id) {
        cargoService.delete(cargo_id);
    }
}
