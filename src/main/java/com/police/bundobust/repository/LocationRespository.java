package com.police.bundobust.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.police.bundobust.model.Location;

@Repository
public interface LocationRespository extends MongoRepository<Location, String> {

	@Query(value = " {'locationdata.district': ?0}")
	List<Location> findbydistrict(String district);

	@Query("{'$and':[{ 'locationdata.district' : ?0 },{'locationdata.sdpo':?1}]}")

List<Location> findbydistrictandsdpo(String district, String sdpo);

	@Query(value = "{'locationdata':{'district':?0,'sdpo':?1,'circle':?2}}")

List<Location> findbydistrictandsdpoandcircle(String district, String sdpo,String circle);

	List<Location> findAll();

	
}