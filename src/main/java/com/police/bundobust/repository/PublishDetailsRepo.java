package com.police.bundobust.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.police.bundobust.model.PersonalInfo;

@Repository
public interface PublishDetailsRepo  extends MongoRepository<PersonalInfo, String> {

	
	@SuppressWarnings("unchecked")
	PersonalInfo save(PersonalInfo personalinfo);
}
