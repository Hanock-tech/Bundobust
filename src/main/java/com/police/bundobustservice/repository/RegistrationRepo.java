package com.police.bundobustservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.police.bundobustservice.model.RegisterForAccess;

@Repository
public interface RegistrationRepo  extends MongoRepository<RegisterForAccess, String> {

	@SuppressWarnings("unchecked")
	RegisterForAccess save(RegisterForAccess register);
}
