package com.police.bundobust.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.police.bundobust.model.GenericResponse;
import com.police.bundobust.model.Location;
import com.police.bundobust.model.LocationDetails;
import com.police.bundobust.model.LocationsArray;
import com.police.bundobust.service.LocationService;

@RestController
@RequestMapping("/api")
public class LocationDetailController {

	private static String[] locationList;
	@Autowired
	private LocationService locationservice;


	@GetMapping("/districts")
	public ResponseEntity<GenericResponse<LocationsArray>> getdistrict() {

		Optional<Set<String>> districtlist = Optional.of(new TreeSet<>());

		List<Location> location = locationservice.findAll();
		if (null != location && !location.isEmpty()) {
			for (Location locationdata : location) {
				List<LocationDetails> details = locationdata.getLocationdata();

				if (null != details && !details.isEmpty()) {

					for (LocationDetails data : details) {
						if (data.getDistrict() != null && !data.getDistrict().isEmpty()
								&& !districtlist.get().contains(data.getDistrict())) {
							districtlist.get().add(data.getDistrict());
						}
					}
				}
			}

			locationList = districtlist.get().toArray(new String[districtlist.get().size()]);
		}
		LocationsArray res = new LocationsArray();
		res.setDistricts(locationList);

		GenericResponse<LocationsArray> response = new GenericResponse<>();
		response.setData(res);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/sdpos")
	public ResponseEntity<GenericResponse<LocationsArray>> getBank(@RequestParam(value = "district") String district) {

		Optional<Set<String>> sdpolist = Optional.of(new TreeSet<>());
		List<Location> locationresponse = locationservice.findBydistrict(district);
		System.out.println(locationresponse);
		if (null != locationresponse && !locationresponse.isEmpty()) {
			for (Location locationdata : locationresponse) {

				List<LocationDetails> locationlist = locationdata.getLocationdata();
				if (null != locationlist && !locationlist.isEmpty()) {

					for (LocationDetails data : locationlist) {
						if (data.getDistrict().equals(district)) {
							if (data.getSdpo() != null && !data.getSdpo().isEmpty()
									&& !sdpolist.get().contains(data.getSdpo())) {
								sdpolist.get().add(data.getSdpo());
							}

						}
					}
				}

			}
			locationList = sdpolist.get().toArray(new String[sdpolist.get().size()]);
		}

		LocationsArray res = new LocationsArray();
		res.setSdpos(locationList);

		GenericResponse<LocationsArray> response1 = new GenericResponse<>();
		response1.setData(res);

		return new ResponseEntity<>(response1, HttpStatus.OK);
	}

	@GetMapping("/circles")
	public ResponseEntity<GenericResponse<LocationsArray>> getcircles(@RequestParam(value = "district") String district,
			@RequestParam(value = "sdpo") String sdpo) {

		List<Location> locationresponse = locationservice.findbydistrictandsdpo(district, sdpo);
		System.out.println(locationresponse);
		Optional<Set<String>> circleslist = Optional.of(new TreeSet<>());

		if (null != locationresponse && !locationresponse.isEmpty()) {
			for (Location locationdata : locationresponse) {

				List<LocationDetails> locationlist = locationdata.getLocationdata();
				if (null != locationlist && !locationlist.isEmpty()) {

					for (LocationDetails data : locationlist) {
						if (data.getSdpo().equals(sdpo) && data.getDistrict().equals(district)) {
							if (data.getCircle() != null && !data.getCircle().isEmpty()
									&& !circleslist.get().contains(data.getCircle())) {
								circleslist.get().add(data.getCircle());

							}
						}

					}
				}

			}
			locationList = circleslist.get().toArray(new String[circleslist.get().size()]);
		}

		LocationsArray res = new LocationsArray();
		res.setCircles(locationList);

		GenericResponse<LocationsArray> response1 = new GenericResponse<>();
		response1.setData(res);

		return new ResponseEntity<>(response1, HttpStatus.OK);

	}

	@GetMapping("/policestations")
	public ResponseEntity<GenericResponse<LocationsArray>> getpolicestation(
			@RequestParam(value = "circle") String circle, @RequestParam(value = "district") String district,
			@RequestParam(value = "sdpo") String sdpo) {

		List<Location> response = locationservice.findbydistrictandsdpoandcircle(district, sdpo, circle);
		System.out.println(response);
		Optional<Set<String>> policestationlist = Optional.of(new TreeSet<>());
		if (null != response && !response.isEmpty()) {
			for (Location locationdata : response) {
				List<LocationDetails> data = locationdata.getLocationdata();
				if (null != data && !data.isEmpty()) {
					for (LocationDetails locationdetails : data) {
						if (locationdetails.getCircle().equals(circle) && locationdetails.getSdpo().equals(sdpo)
								&& locationdetails.getDistrict().equals(district)) {
							System.out.println(locationdetails.getCircle());
							if (locationdetails.getPolicestation() != null
									&& !locationdetails.getPolicestation().isEmpty()
									&& !policestationlist.get().contains(locationdetails.getPolicestation())) {
								policestationlist.get().add(locationdetails.getPolicestation());
							}

						}

					}

				}

			}
			locationList = policestationlist.get().toArray(new String[policestationlist.get().size()]);
		}
		LocationsArray res = new LocationsArray();
		res.setPolicestations(locationList);

		GenericResponse<LocationsArray> response1 = new GenericResponse<>();
		response1.setData(res);

		return new ResponseEntity<>(response1, HttpStatus.OK);
	}

	@GetMapping("/ranks")
	public GenericResponse<LocationsArray> getranks() {
		List<Location> location = locationservice.findAll();
		GenericResponse<LocationsArray> response1 = new GenericResponse<>();
		if (location != null) {
			for (Location locationdata : location) {
				String[] ranks = locationdata.getRanks();
				LocationsArray res = new LocationsArray();
				res.setRanks(ranks);

				response1.setData(res);
			}
		}

		return response1;

	}

}
