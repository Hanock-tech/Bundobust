package com.police.bundobustservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.police.bundobustservice.model.Location;
import com.police.bundobustservice.repository.LocationRespository;

@Service
public class LocationServiceImplementation implements LocationService {

	@Autowired
	private LocationRespository locationrepo;

	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return locationrepo.findAll();
	}

	@Override
	public List<Location> findBydistrict(String district) {
		// TODO Auto-generated method stub
		return locationrepo.findbydistrict(district);
	}

	@Override
	public List<Location> findbydistrictandsdpo(String district, String sdpo) {
		// TODO Auto-generated method stub
		return locationrepo.findbydistrictandsdpo(district, sdpo);
	}

	@Override
	public List<Location> findbydistrictandsdpoandcircle(String district, String sdpo, String circle) {
		// TODO Auto-generated method stub
		return locationrepo.findbydistrictandsdpoandcircle(district, sdpo, circle);
	}

}
