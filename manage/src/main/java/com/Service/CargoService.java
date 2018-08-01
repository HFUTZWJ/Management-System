package com.Service;

import com.Info.Cargo;
import com.Mapper.CargoMapper;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class CargoService {
    @Resource
    private CargoMapper cargoMapper;

    public List getAllCargo() {
        System.out.println(cargoMapper.getCargoList().toString());
        return cargoMapper.getCargoList();
    }

    public int addCargo(Cargo cargo) {
        return cargoMapper.add(cargo);
    }

    public int update(Integer id,String name) {
        return cargoMapper.update(id,name);
    }

    public int delete(Integer cargo_id) {
        return cargoMapper.delete(cargo_id);
    }
}
