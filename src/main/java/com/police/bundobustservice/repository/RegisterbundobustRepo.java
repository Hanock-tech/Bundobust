package com.police.bundobustservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.police.bundobustservice.model.Registerbundobust;

@Repository
public interface RegisterbundobustRepo extends MongoRepository<Registerbundobust, String> {

	@SuppressWarnings("unchecked")
	Registerbundobust save(Registerbundobust bundobust);

}