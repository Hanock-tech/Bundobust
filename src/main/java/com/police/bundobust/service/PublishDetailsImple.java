package com.police.bundobust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.police.bundobust.model.PersonalInfo;
import com.police.bundobust.repository.PublishDetailsRepo;
@Service
public class PublishDetailsImple implements PublishService {
	@Autowired
	private PublishDetailsRepo publishrepo;
	@Override
	public String publishdetails(PersonalInfo personalinfo) {
		// TODO Auto-generated method stub
		String status="";
	
		PersonalInfo result=publishrepo.save(personalinfo);
System.out.println(result);
			if (result != null) 
				status = "success";
			else
				status = "failed";
		
		
		return status;
	
	}

}
