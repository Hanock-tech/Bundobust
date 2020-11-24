package com.police.bundobustservice.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.police.bundobustservice.model.Registerbundobust;
import com.police.bundobustservice.repository.RegisterbundobustRepo;

@Service
public class createbundobustServiceimple implements RegisterbundobustService {

	@Autowired
	private RegisterbundobustRepo registerbundobustrepo;

	@Override
	public String createbundobust(Registerbundobust bundobust) {
		// TODO Auto-generated method stub
		Random random=new Random();
		String randomId = Integer.toString(random.nextInt()) + (System.currentTimeMillis() / 1000L);
		String eventId = "TS" +  randomId.substring(0, 6);
		String status = " ";
		if (bundobust != null) {

			bundobust.set_id(eventId);
		}

		Registerbundobust result = registerbundobustrepo.save(bundobust);
		if (result != null)
			status = "success";
		else
			status = "failed";

		return status;
	}



}
