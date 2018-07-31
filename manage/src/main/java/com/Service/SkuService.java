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

    public int skuAdd(Sku sku) {
        return skuMapper.skuAdd(sku);
    }

    public int skuUpdate(Integer ware_id,String sku_name,Integer cargo_id,Integer sku_id) {
        return skuMapper.skuUpdate(ware_id, sku_name, cargo_id, ware_id);
    }


    public int skuDelete(Integer sku_id) {
        return skuMapper.skuDelete(sku_id);
    }

}
