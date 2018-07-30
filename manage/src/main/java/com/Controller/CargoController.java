package com.Controller;

import com.Info.Cargo;
import com.Service.CargoService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(value = {"/addcargo"}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, method = RequestMethod.GET)
    public String add(HttpServletRequest request) {
        String Id = request.getParameter("cargoId");
        String cargoName = request.getParameter("cargoName");
        Cargo newcargo = new Cargo();
        int cargoId = Integer.valueOf(Id).intValue();
        newcargo.setCargo_id(cargoId);
        newcargo.setCargo_name(cargoName);
        cargoService.addCargo(newcargo);
        return "/success.html";
    }

    @RequestMapping(value = {"/update"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int update() {
        return cargoService.update();
    }

    @RequestMapping(value = {"/delete"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public int delete() {
        return cargoService.delete();
    }
}
