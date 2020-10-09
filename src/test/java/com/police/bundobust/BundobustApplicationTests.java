package com.police.bundobust;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.police.bundobust.model.Registerbundobust;
import com.police.bundobust.repository.RegisterbundobustRepo;
import com.police.bundobust.serviceimplement.createbundobustServiceimple;

@SpringBootTest
class BundobustApplicationTests {

	@Autowired
	private	RegisterbundobustRepo registerbundobustrepo;
	@Autowired
	private  createbundobustServiceimple registerservice;
	
	
	@Test
	void savebundobust() {
	//	Registerbundobust bundobust=new Registerbundobust();
		Registerbundobust bundobust = mock(Registerbundobust.class);
		
		bundobust.setNameofevent("ganesh budobust");
		bundobust.setDistrict("Telangana");
		bundobust.setCircle("circle");
		bundobust.setPolicestation("medchal");
		bundobust.setEnddate("29/3/2020");
		bundobust.setSdpo("medcal");
		bundobust.setStaff("data");
		bundobust.setStartdate("30/02/199");
		when(bundobust.getDistrict()).thenReturn("Telangana");
		 assertEquals(bundobust.getDistrict(), "Telangana");
		
		
	}

	
	
	
}
