package com.police.bundobust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.police.bundobust.model.RegisterForAccess;
import com.police.bundobust.repository.RegistrationRepo;

@Service
public class RegisterServiceImplementation implements RegisterService {

	@Autowired
	private RegistrationRepo registerrepo;
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public String register(RegisterForAccess register) {
		// TODO Auto-generated method stub

		String status = "";
		try {
			if(register.getPassword()!=register.getConfirmPassword()) {
				status="password and confirm password should be  match";
					return status; 
				}
			
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(register.getIdNumber()));
			//query.addCriteria(Criteria.where("email").is(register.getEmail()));
			RegisterForAccess userdata = mongoTemplate.findOne(query, RegisterForAccess.class);
			System.out.println(userdata);
			if (userdata != null) {
				if(userdata.getIdNumber().equals(register.getIdNumber()))
				status = "You have already register with this email";
			} else {
				RegisterForAccess result = registerrepo.save(register);

				if (result != null) {
					status = "success";
				} else
					status = "failed";
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return status;
	}

}
