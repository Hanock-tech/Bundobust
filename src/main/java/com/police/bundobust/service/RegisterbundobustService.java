package com.police.bundobust.service;

import org.springframework.stereotype.Service;

import com.police.bundobust.model.Registerbundobust;
@Service
public interface RegisterbundobustService {

	String  createbundobust(Registerbundobust bundobust);
	
}
