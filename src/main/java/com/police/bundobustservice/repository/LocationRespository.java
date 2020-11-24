package com.police.bundobustservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.police.bundobustservice.model.Location;

@Repository
public interface LocationRespository extends MongoRepository<Location, String> {

	@Query(value = " {'locationdata.district': ?0}")
	List<Location> findbydistrict(String district);

	@Query(value="{ 'locationdata.district' : ?0 }")

List<Location> findbydistrictandsdpo(String district, String sdpo);

	@Query(value = "{'locationdata.district':?0}")

List<Location> findbydistrictandsdpoandcircle(String district, String sdpo,String circle);

	List<Location> findAll();

	
}