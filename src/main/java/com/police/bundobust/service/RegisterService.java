package com.police.bundobust.service;

import org.springframework.stereotype.Service;

import com.police.bundobust.model.RegisterForAccess;

@Service
public interface RegisterService {
	
	String register(RegisterForAccess register);

}
