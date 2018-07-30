package com.Mapper;

import com.Info.Cargo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CargoMapper {
    @Select("SELECT * FROM cargo WHERE cargo_id = #{cargo_id}")
    Cargo getCargoById(Integer id);

    @Select("SELECT * FROM cargo")
    public List<Cargo> getCargoList();

    @Insert("insert into cargo values(#{cargo_id}, #{cargo_name})")
    public int add(Cargo cargo);

    @Update("UPDATE cargo SET cargo_name = #{name} WHERE cargo_id = #{id}")
    public int update( @Param("id") Integer id , @Param("name") String name);

    @Delete("DELETE from cargo where cargo_id = #{id} ")
    public int delete(Integer id);

}
