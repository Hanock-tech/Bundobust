package com.police.bundobust.service;

import org.springframework.stereotype.Service;

import com.police.bundobust.model.PersonalInfo;
@Service
public interface PublishService {

	String publishdetails(PersonalInfo personalinfo);
	
	
}
