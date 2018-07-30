package com.Mapper;

import com.Info.WareHouse;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface WareMapper {
    @Select("SELECT * FROM warehouse WHERE ware_id = #{id}")
    WareHouse getWareById(Integer id);

    @Select("SELECT * FROM warehouse")
    public List<WareHouse> getWareList();

    @Insert("insert into warehouse values(#{ware_id}, #{ware_name} ,#{ware_location})")
    public int add(WareHouse wareHouse);

    @Update("UPDATE warehouse SET ware_name = #{name} and ware_location = #{location} WHERE ware_id = #{id}")
    public int update(@Param("id") Integer id , @Param("name") String name , @Param("location") String location);

    @Delete("DELETE from warehouse where ware_id = #{id} ")
    public int delete(Integer id);
}
