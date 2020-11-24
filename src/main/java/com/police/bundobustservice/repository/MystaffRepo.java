package com.police.bundobustservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.police.bundobustservice.model.MystaffDemo;

@Repository
public interface MystaffRepo extends MongoRepository<MystaffDemo, String> {

	List<MystaffDemo> findAll();

	
}