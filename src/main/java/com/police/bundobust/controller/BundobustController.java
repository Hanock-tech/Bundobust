package com.police.bundobust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.police.bundobust.model.GenericResponse;
import com.police.bundobust.model.Registerbundobust;
import com.police.bundobust.service.RegisterbundobustService;

@RestController
@RequestMapping("/api")
public class BundobustController {

	@Autowired
	private RegisterbundobustService registerbundobustservice;

	@PostMapping(value = "/bundobust")
	public GenericResponse<String> createbundobust(@RequestBody Registerbundobust registerbundobust) {

		
				String status=registerbundobustservice.createbundobust(registerbundobust);
				GenericResponse<String> response=new GenericResponse<String>();
				response.setMsg(status);
				
				return  response;
	}
}
