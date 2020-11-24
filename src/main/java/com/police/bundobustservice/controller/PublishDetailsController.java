package com.police.bundobustservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.police.bundobustservice.model.CreateProfile;
import com.police.bundobustservice.model.GenericResponse;
import com.police.bundobustservice.model.PersonalInformation;
import com.police.bundobustservice.service.CreateProfileService;

@RestController
@RequestMapping("/api")
public class PublishDetailsController {
	@Autowired
	private CreateProfileService publishservice;

	@PostMapping(value = "ps/staff")
	public GenericResponse<String> profiledetails(@RequestBody CreateProfile information) {

		String status = publishservice.profileDetails(information);
		GenericResponse<String> response = new GenericResponse<String>();
		PersonalInformation personalInformation = information.getPersonalInformation();
		response.setRequestId(personalInformation.getId());
		response.setMsg(status);

		return response;

	}

}
