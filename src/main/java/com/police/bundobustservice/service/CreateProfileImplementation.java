package com.police.bundobustservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.police.bundobustservice.model.CreateProfile;
import com.police.bundobustservice.model.PersonalInformation;
import com.police.bundobustservice.repository.PublishDetailsRepo;

@Service
public class CreateProfileImplementation implements CreateProfileService {
	@Autowired
	private PublishDetailsRepo publishrepo;

	@Override
	public String profileDetails(CreateProfile information) {
		// TODO Auto-generated method stub
		String status = "";
		if (information != null) {
			PersonalInformation informationdata = information.getPersonalInformation();
			information.setId(informationdata.getId());

			CreateProfile result = publishrepo.save(information);
			if (result != null)
				status = "information details Submitted successfully";
			else
				status = "failed";
		}
		return status;

	}

}
