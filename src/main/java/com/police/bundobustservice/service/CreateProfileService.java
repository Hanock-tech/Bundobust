package com.police.bundobustservice.service;

import org.springframework.stereotype.Service;

import com.police.bundobustservice.model.CreateProfile;

@Service
public interface CreateProfileService {

	String profileDetails(CreateProfile personalinfo);

}
