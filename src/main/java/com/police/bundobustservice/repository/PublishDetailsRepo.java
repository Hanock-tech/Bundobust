package com.police.bundobustservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.police.bundobustservice.model.CreateProfile;

@Repository
public interface PublishDetailsRepo  extends MongoRepository<CreateProfile, String> {

	
	@SuppressWarnings("unchecked")
	CreateProfile save(CreateProfile personalinfo);
}
