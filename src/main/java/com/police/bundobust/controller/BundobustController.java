package com.police.bundobust.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindingResult;
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
	public GenericResponse<String> createbundobust(@Valid @RequestBody Registerbundobust registerbundobust,BindingResult binding)throws Exception {

		String status = registerbundobustservice.createbundobust(registerbundobust);
		GenericResponse<String> response = new GenericResponse<String>();
		response.setMsg(status);
		if(binding.hasFieldErrors()) {
			DefaultMessageSourceResolvable error = binding.getFieldError();
			throw new Exception(error.getDefaultMessage());
		}

		return response;
	}
}
