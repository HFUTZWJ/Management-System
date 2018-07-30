package com.Service;

import com.Info.WareHouse;
import com.Mapper.WareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WareService {
    @Autowired
    private WareMapper wareMapper;

    private WareHouse wareHouse = new WareHouse(6, "HELLO","abc");


    public List getAllWare() {
        return wareMapper.getWareList();
        //return "hello";
    }

    public int add() {
        return wareMapper.add(wareHouse);
    }

    public int update() {
        return wareMapper.update(6,"hello","ABC");
    }

    public int delete() {
        return wareMapper.delete(wareHouse.getWare_id());
    }
}
