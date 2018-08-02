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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
              jo.put("sku_id",s.getSku_id());
              jo.put("sku_name",s.getSku_name());
              jo.put("cargo_id",s.getCargo_id());
              jo.put("ware_id",s.getWare_id());
              json.add(jo);
          }
          System.out.println(json);
          return json.toString();
    }

    @RequestMapping(value = {"/getAllsku"},produces = {"application/json;charset=UTF-8"})
    public String getAllsku(){
        List<Sku> skuList = skuService.getAllSku();
        JSONArray json = new JSONArray();
        for(Sku s : skuList){
            JSONObject jo = new JSONObject();
            jo.put("sku_id",s.getSku_id());
            jo.put("sku_name",s.getSku_name());
            jo.put("cargo_id",s.getCargo_id());
            jo.put("ware_id",s.getWare_id());
            json.add(jo);
        }
        return json.toString();
    }

    @RequestMapping(value = {"/addsku"}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, method = RequestMethod.GET)
    public void add(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入");
        String cargoName = request.getParameter("cargoName");
        String cargoID = request.getParameter("cargoID");
        String wareID = request.getParameter("wareID");
        String skuID = request.getParameter("skuID");
        int cargoId = Integer.valueOf(cargoID).intValue();
        int wareId = Integer.valueOf(wareID).intValue();
        int skuId = Integer.valueOf(skuID).intValue();
        System.out.println(cargoName);
        skuService.skuAdd(cargoName,cargoId,wareId,skuId);
        request.getRequestDispatcher("/allcargo.html").forward(request, response);
    }
    @RequestMapping(value = {"/deleteSku"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public void delete(@RequestParam("sku_id") Integer sku_id) {
        skuService.skuDelete(sku_id);
    }

}
