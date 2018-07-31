package com.Mapper;


import com.Info.Sku;
import com.Info.WareHouse;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SkuMapper {
    @Select("SELECT * FROM sku WHERE cargo_id = #{cargo_id} ")
    public List<Sku> getSkuListByCargoType(Integer cargo_id);

    @Update("UPDATE sku SET ware_id = #{ware_id} and sku_name = #{sku_name} and cargo_id = #{cargo_id} WHERE sku_id = #{sku_id}")
    public int skuUpdate(@Param("ware_id") Integer ware_id, @Param("sku_name") String sku_name, @Param("cargo_id") Integer cargo_id, @Param("sku_id") Integer sku_id);

    @Delete("DELETE from sku where sku_id = #{sku_id} ")
    public int skuDelete(Integer sku_id);

    @Insert("insert into sku values(#{sku_id}, #{sku_name} ,#{ware_id},#{cargo_id})")
    public int skuAdd(Sku sku);
}
