package com.police.bundobust.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.police.bundobust.model.RegisterForAccess;
@Repository
public interface RegistrationRepo  extends MongoRepository<RegisterForAccess, String> {

	@SuppressWarnings("unchecked")
	RegisterForAccess save(RegisterForAccess register);
}
