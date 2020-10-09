package com.police.bundobust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.police.bundobust.model.RegisterForAccess;
import com.police.bundobust.service.SigninService;
@RestController
@RequestMapping("/api")
public class SigninController {
	
	@Autowired
	private SigninService signservice;
	
	
	@PostMapping(value="/user/signin")
	public String signin(@RequestBody RegisterForAccess register ) {
		
		String status=signservice.signin(register);
		
		return status;
		
	}

}
