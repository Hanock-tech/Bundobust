package com.police.bundobust.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.police.bundobust.model.DistrictArray;
import com.police.bundobust.model.GenericResponse;
import com.police.bundobust.model.Location;
import com.police.bundobust.model.LocationDetails;
import com.police.bundobust.service.LocationService;
@RestController
@RequestMapping("/api")
public class LocationDetailController {
	@Autowired
	private MongoTemplate mongoTemplate;
	private static String[] locationList;
	@Autowired
	 private LocationService locationservice;
	
	
	@GetMapping("/districts")
	public ResponseEntity<GenericResponse<DistrictArray>> getdistrict() {

		Optional<Set<String>> districtlist = Optional.of(new TreeSet<>());
	
		List<Location> location = locationservice.findAll();
		if (null != location && !location.isEmpty()) {
			for (Location locationdata : location) {
				List<LocationDetails> details =locationdata.getLocationdata() ;

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
		DistrictArray res=new DistrictArray();
		res.setDistricts(locationList);
		
		GenericResponse<DistrictArray> response = new GenericResponse<>();
		response.setData(res);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
		
	
	@GetMapping("/sdpo")
	public ResponseEntity<GenericResponse<DistrictArray>> getBank(@RequestParam(value = "district") String district) {
		
		
		Optional<Set<String>> sdpolist = Optional.of(new TreeSet<>());
		List<Location> locationresponse = locationservice.findBydistrict(district);
		if (null != locationresponse && !locationresponse.isEmpty()) {
			for (Location locationdata : locationresponse) {

				List<LocationDetails> locationlist = locationdata.getLocationdata();
				if (null != locationlist && !locationlist.isEmpty()) {

					for (LocationDetails data : locationlist) {
						if (data.getSdpo() != null && !data.getSdpo().isEmpty()
								&& !sdpolist.get().contains(data.getSdpo())) {
							sdpolist.get().add(data.getSdpo());
						}
					
					}
				
				
				}

				
			}
			locationList = sdpolist.get().toArray(new String[sdpolist.get().size()]);
		}
			
			DistrictArray res=new DistrictArray();
			res.setDistricts(locationList);
			
		
		
		GenericResponse<DistrictArray> response1 = new GenericResponse<>();
		response1.setData(res);

		return new ResponseEntity<>(response1, HttpStatus.OK);
	}
	
	@GetMapping("/circles")
	public ResponseEntity<GenericResponse<DistrictArray>> getcircles(@RequestParam(value = "district") String district,
			@RequestParam(value = "sdpo") String sdpo) {
		
		
		Criteria findByfunctionhallname = Criteria.where("locationdata")
				.elemMatch(Criteria.where("district").is("Adilabad"));
				Criteria findByfunctionhallId = Criteria.where("locationdata")
				.elemMatch(Criteria.where("sdpo").is("Adilabad sdpo"));
				
		BasicQuery query1 = new BasicQuery(findByfunctionhallname.getCriteriaObject(),findByfunctionhallId.getCriteriaObject());
		System.out.println(query1);
		
		
		Query query=new Query();
		//query.addCriteria(Criteria.where("locationdata").elemMatch(Criteria.where("district").is("Adilabad")));
		query.addCriteria(Criteria.where("locationdata").elemMatch(Criteria.where("sdpo").is("Adilabad sdpo")));
		System.out.println(query);
		List<Location> ownerdata = mongoTemplate.find(query1, Location.class);
		System.out.println(ownerdata);
		
		List<Location>  locationresponse = locationservice.findbydistrictandsdpo(district, sdpo);
System.out.println(locationresponse);
		Optional<Set<String>> circleslist = Optional.of(new TreeSet<>());
	
		if (null != locationresponse && !locationresponse.isEmpty()) {
			for (Location locationdata : locationresponse) {

				List<LocationDetails> locationlist = locationdata.getLocationdata();
				if (null != locationlist && !locationlist.isEmpty()) {

					for (LocationDetails data : locationlist) {
						if (data.getCircle() != null && !data.getCircle().isEmpty()
								&& !circleslist.get().contains(data.getCircle())) {
							circleslist.get().add(data.getCircle());
						}
					
					}
				
				
				}

				
			}
			locationList = circleslist.get().toArray(new String[circleslist.get().size()]);
		}
			
			DistrictArray res=new DistrictArray();
			res.setDistricts(locationList);
			
		
		
		GenericResponse<DistrictArray> response1 = new GenericResponse<>();
		response1.setData(res);
	
		return new ResponseEntity<>(response1, HttpStatus.OK);
	
}
	
	

	@GetMapping("/policestations")
	public ResponseEntity<GenericResponse<DistrictArray>> getpolicestation(@RequestParam(value = "district") String district,
			@RequestParam(value = "sdpo") String sdpo,@RequestParam(value = "circle") String circle) {
	
		

		List<Location> response = locationservice.findbydistrictandsdpoandcircle(district, sdpo, circle);
		System.out.println(response);
		Optional<Set<String>> policestationlist = Optional.of(new TreeSet<>());
		if (null != response && !response.isEmpty()) {
			for (Location locationdata : response) {
				List<LocationDetails> data = locationdata.getLocationdata();				
						if (null != data && !data.isEmpty()) {
							for (LocationDetails locationdetails : data) {
								if (locationdetails.getPolicestation() != null && !locationdetails.getPolicestation().isEmpty()
										&& !policestationlist.get().contains(locationdetails.getPolicestation())) {
									policestationlist.get().add(locationdetails.getPolicestation());
								}
							
							}
						
						
						}

						
					}
					locationList = policestationlist.get().toArray(new String[policestationlist.get().size()]);
				}
					
					DistrictArray res=new DistrictArray();
					res.setDistricts(locationList);
					
				
				
				GenericResponse<DistrictArray> response1 = new GenericResponse<>();
				response1.setData(res);

				return new ResponseEntity<>(response1, HttpStatus.OK);
	}
}
