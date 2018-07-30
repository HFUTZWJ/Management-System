package com.Service;

import com.Info.Cargo;
import com.Mapper.CargoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class CargoService {
    @Autowired
    private CargoMapper cargoMapper;

    private Cargo newcargo = new Cargo(1006, "HELLO");


    public List getAllCargo() {
        System.out.println(cargoMapper.getCargoList().toString());
        return cargoMapper.getCargoList();
    }

    public int addCargo(Cargo cargo) {
        return cargoMapper.add(cargo);
    }

    public int update() {
        return cargoMapper.update(1006,"hello");
    }

    public int delete(Integer cargo_id) {
        return cargoMapper.delete(cargo_id);
    }
}
