package com.Service;

import com.Info.WareHouse;
import com.Mapper.WareMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class WareService {
    @Resource
    private WareMapper wareMapper;
    public WareHouse getWareById(Integer ware_id){
        return wareMapper.getWareById(ware_id);
    }
    public List getAllWare() {
        return wareMapper.getWareList();
        //return "hello";
    }

    public int addWare(WareHouse wareHouse) {
        return wareMapper.addWare(wareHouse);
    }

    public int updateWare(Integer id,String name,String location) {
        return wareMapper.updateWare(id,name,location);
    }

    public int deleteWare(Integer ware_id) {
        return wareMapper.deleteWare(ware_id);
    }
}
