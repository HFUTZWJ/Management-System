package com.Mapper;

import com.Info.WareHouse;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface WareMapper {
    @Select("SELECT * FROM warehouse WHERE ware_id = #{id}")
    public WareHouse getWareById(Integer id);

    @Select("SELECT * FROM warehouse")
    public List<WareHouse> getWareList();

    @Insert("insert into warehouse values(#{ware_id}, #{ware_name} ,#{ware_location})")
    public int addWare(WareHouse wareHouse);

    //修改了多个列的值而各列之间用逗号连接而不要用and
    //错误写法示例：update tablename set col1=value1 and col2=value2 where col3=value3；
    //正确写法示例：update tablename set col1=value1 ，col2=value2 where col3=value3；
    @Update("UPDATE warehouse SET ware_name = #{name} , ware_location = #{location} WHERE ware_id = #{id}")
    public int updateWare(@Param("id") Integer id , @Param("name") String name , @Param("location") String location);

    @Delete("DELETE from warehouse where ware_id = #{id} ")
    public int deleteWare(Integer id);
}
