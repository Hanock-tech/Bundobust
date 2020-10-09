package com.police.bundobust.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.police.bundobust.model.Registerbundobust;
import com.police.bundobust.repository.RegisterbundobustRepo;
import com.police.bundobust.service.RegisterbundobustService;
@Service
public class createbundobustServiceimple implements RegisterbundobustService  {
	
	@Autowired
	private	RegisterbundobustRepo registerbundobustrepo;
//@Autowired
//private MongoTemplate mongo;
	@Override
	public String createbundobust(Registerbundobust bundobust) {
		// TODO Auto-generated method stub
		String status= " ";
		
	
		Registerbundobust	result=registerbundobustrepo.save(bundobust);
		if(result!=null) 
					status="success";
		else
			status="failed";
			 
		return status;
	}


}
