package com.Controller;

import com.Info.WareHouse;
import com.Service.WareService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class WareController {
    @Autowired
    private WareService wareService;
    @RequestMapping(value = {"/findWare"}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public String getAllUsers() {
        List<WareHouse> wareList = wareService.getAllWare();
        System.out.println(wareList);
        JSONArray json = new JSONArray();
        for(WareHouse w:wareList){
            JSONObject jo = new JSONObject();
            jo.put("ware_id",w.getWare_id());
            jo.put("ware_name",w.getWare_name());
            jo.put("ware_location",w.getWare_location());
            json.add(jo);
        }
        System.out.println(json);
        return json.toString();
    }

    @RequestMapping(value = {"/findWareById"}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public String getWareById(@RequestParam("ware_id") Integer ware_id) {
        WareHouse ware = wareService.getWareById(ware_id);
        System.out.println(ware);
        JSONObject jo = new JSONObject();
        jo.put("ware_id",ware.getWare_id());
        jo.put("ware_name",ware.getWare_name());
        jo.put("ware_location",ware.getWare_location());
        System.out.println(jo);
        return jo.toString();
    }
    @RequestMapping(value = {"/addWare"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public void add(HttpServletRequest request , HttpServletResponse response) {
        String Id = request.getParameter("wareId");
        String wareName = request.getParameter("wareName");
        String wareLocation = request.getParameter("wareLocation");
        WareHouse newware = new WareHouse();
        int wareId = Integer.valueOf(Id).intValue();
        newware.setWare_id(wareId);
        newware.setWare_name(wareName);
        newware.setWare_location(wareLocation);
        wareService.addWare(newware);
    }

    @RequestMapping(value = {"/updateWare"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public void update(@RequestParam("ware_id") Integer ware_id,@RequestParam("ware_name") String ware_name,@RequestParam("ware_location") String ware_location) {
        System.out.println("ware_id" + ware_id);
        System.out.println("ware_name" + ware_name);
        System.out.println("ware_location" + ware_location);
        wareService.updateWare(ware_id,ware_name,ware_location);
    }

    @RequestMapping(value = {"/deleteWare"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public void delete(@RequestParam("ware_id") Integer ware_id) {
         wareService.deleteWare(ware_id);
    }
}
