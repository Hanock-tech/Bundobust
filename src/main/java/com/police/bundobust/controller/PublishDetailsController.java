package com.police.bundobust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.police.bundobust.model.GenericResponse;
import com.police.bundobust.model.PersonalInfo;
import com.police.bundobust.service.PublishDetailsImple;

@RestController
@RequestMapping("/api")
public class PublishDetailsController {
@Autowired
	private PublishDetailsImple publishservice;
	
	@PostMapping(value = "/details")
	public GenericResponse<String> publishdetails(@RequestBody PersonalInfo personalinfo) {
		
//		
//		if (personalinfo != null) {
//			DefaultMessageSourceResolvable error = binding.getFieldError();
//			throw new Exception(error.getDefaultMessage());
//		}
		
		String status = publishservice.publishdetails(personalinfo);
		GenericResponse<String> response = new GenericResponse<String>();
		response.setMsg(status);

		return response;
		
	}

}
