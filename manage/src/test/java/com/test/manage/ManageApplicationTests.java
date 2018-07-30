package com.test.manage;

import com.Info.Cargo;
import com.Mapper.CargoMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {
	@Autowired
	private CargoMapper cargoMapper;
	@Test
	public void contextLoads() {
		cargoMapper.getCargoList();
		Cargo cargo = cargoMapper.getCargoById(1001);
		Assert.assertEquals("螺丝刀", cargo.getCargo_name());
	}

}
