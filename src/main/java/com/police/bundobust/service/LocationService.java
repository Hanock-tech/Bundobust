package com.police.bundobust.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.police.bundobust.model.Location;
@Service
public interface LocationService {
	

	List<Location> findAll();
	List<Location> findBydistrict(String district);
	List<Location> findbydistrictandsdpo(String district, String sdpo);
	List<Location> findbydistrictandsdpoandcircle(String district, String sdpo, String circle);

}
