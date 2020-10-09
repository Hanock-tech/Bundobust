package com.police.bundobust.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.police.bundobust.model.GenericResponse;
import com.police.bundobust.model.RegisterForAccess;
import com.police.bundobust.service.RegisterService;

@RestController
@RequestMapping("/api")
public class RegistrationController {
	
	@Autowired
	public RegisterService registerservice;
	
	
	@PostMapping(value="/user/register")
	public GenericResponse<String> createbundobust(@Valid @RequestBody RegisterForAccess register) {

		
		String status=registerservice.register(register);
		GenericResponse<String> response=new GenericResponse<String>();
		response.setMsg(status);
		
		return  response;

}
}
