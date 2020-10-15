package com.police.bundobust.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="locationdetails")
public class Location {

	private String Id;
	private List<LocationDetails> locationdata;
	private String ranks[];
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public List<LocationDetails> getLocationdata() {
		return locationdata;
	}
	public String[] getRanks() {
		return ranks;
	}
	public void setRanks(String[] ranks) {
		this.ranks = ranks;
	}
	public void setLocationdata(List<LocationDetails> locationdata) {
		this.locationdata = locationdata;
	}
	@Override
	public String toString() {
		return "Location [Id=" + Id + ", locationdata=" + locationdata + ", ranks=" + Arrays.toString(ranks) + "]";
	}

	
	
}
