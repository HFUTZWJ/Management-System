package com.Controller;

import com.Info.Cargo;
import com.Info.Sku;
import com.Service.SkuService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkuController {
    @Autowired
    SkuService skuService;
    @RequestMapping(value = {"/getsku"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public String getSkuByCargo(@RequestParam("cargo_id") Integer cargo_id)
    {
          List<Sku> skuList = skuService.getSkuListByCargoType(cargo_id);
          System.out.println(skuList);
          JSONArray json = new JSONArray();
          for(Sku s : skuList){
              JSONObject jo = new JSONObject();
              jo.put("sku_id",s.getCargo_id());
              jo.put("sku_name",s.getSku_name());
              jo.put("cargo_id",s.getCargo_id());
              jo.put("ware_id",s.getWare_id());
              json.add(jo);
          }
          System.out.println(json);
          return json.toString();
    }
}
