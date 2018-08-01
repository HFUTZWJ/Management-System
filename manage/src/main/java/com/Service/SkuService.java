package com.Service;


import com.Info.Sku;

import com.Mapper.SkuMapper;
import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SkuService {
    @Resource
    private SkuMapper skuMapper;

    public List<Sku> getSkuListByCargoType(Integer cargo_id) {
        System.out.println(skuMapper.getSkuListByCargoType(cargo_id).toString());
        return skuMapper.getSkuListByCargoType(cargo_id);
    }

    public List<Sku> getAllSku(){
        return skuMapper.getAllSku();
    }
    public int skuAdd(String cargoName,int cargoID,int wareID,int skuID) {
        Sku newsku = new Sku();
        newsku.setSku_name(cargoName);
        newsku.setCargo_id(cargoID);
        newsku.setSku_id(skuID);
        newsku.setWare_id(wareID);
        System.out.println(newsku.toString());
        return skuMapper.skuAdd(newsku);
    }

    public int skuUpdate(Integer ware_id,String sku_name,Integer cargo_id,Integer sku_id) {
        return skuMapper.skuUpdate(ware_id, sku_name, cargo_id, ware_id);
    }


    public int skuDelete(Integer sku_id) {
        return skuMapper.skuDelete(sku_id);
    }

}
