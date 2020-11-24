package com.police.bundobustservice.service;

import org.springframework.stereotype.Service;

import com.police.bundobustservice.model.Registerbundobust;

@Service
public interface RegisterbundobustService {

	String createbundobust(Registerbundobust bundobust);

}
