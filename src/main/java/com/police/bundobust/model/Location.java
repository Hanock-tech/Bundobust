package com.police.bundobust.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="locationdetails")
public class Location {

	private String Id;
	private List<LocationDetails> locationdata;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public List<LocationDetails> getLocationdata() {
		return locationdata;
	}
	public void setLocationdata(List<LocationDetails> locationdata) {
		this.locationdata = locationdata;
	}
	@Override
	public String toString() {
		return "Location [Id=" + Id + ", locationdata=" + locationdata + "]";
	}

	
	
}
