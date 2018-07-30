package com.test.manage;

import com.Info.Cargo;
import com.MapperR.Mapper;
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
	private Mapper mapper;
	@Test
	public void contextLoads() {
		mapper.getCargoList();
		Cargo cargo = mapper.getCargoById(1001);
		Assert.assertEquals("螺丝刀", cargo.getCargo_name());
	}

}
