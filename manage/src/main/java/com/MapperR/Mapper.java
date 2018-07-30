package com.MapperR;

import com.Info.Cargo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Mapper {
    @Select("SELECT * FROM cargo WHERE cargo_id = #{cargo_id}")
    Cargo getCargoById(Integer id);

    @Select("SELECT * FROM cargo")
    public List<Cargo> getCargoList();

    @Insert("insert into cargo values(#{cargo_id}, #{cargo_name})")
    public int add(Cargo user);

    @Update("UPDATE cargo SET carge_name = #{name} WHERE carge_id = #{id}")
    public int update(@Param("name") String name,@Param("id") Integer id);

    @Delete("DELETE from cargo where cargo_id = #{cargo_id} ")
    public int delete(Integer id);

}
