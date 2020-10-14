package com.police.bundobust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.police.bundobust.model.RegisterForAccess;
@Service
public class SigninServiceImple implements SigninService {


	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public String signin(RegisterForAccess register) {
		// TODO Auto-generated method stub
		String status="";
		
		
		Query query=new Query();
		query.addCriteria(Criteria.where("").orOperator(Criteria.where("idNumber").is(register.getIdNumber()),(Criteria.where("mobileNumber").is(register.getMobileNumber()))));
		System.out.println(query);
		RegisterForAccess userdata = mongoTemplate.findOne(query, RegisterForAccess.class);
		System.out.println(userdata);
		if(userdata!=null) {
		if(register.getPassword().equals(userdata.getPassword())) {
			status="success";
		}
		else
		status ="password did not match";	
	}
		else
			status="your not register with us please register ";
		
		
		return status;

		}
}