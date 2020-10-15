package com.police.bundobust.model;

import java.util.Arrays;

public class LocationsArray {

	private String[] districts;
	private String[] sdpos;
	private String[] ranks;
	public String[] getRanks() {
		return ranks;
	}

	public void setRanks(String[] ranks) {
		this.ranks = ranks;
	}

	public String[] getSdpos() {
		return sdpos;
	}

	public void setSdpos(String[] sdpos) {
		this.sdpos = sdpos;
	}

	public String[] getCircles() {
		return circles;
	}

	public void setCircles(String[] circles) {
		this.circles = circles;
	}

	public String[] getPolicestations() {
		return policestations;
	}

	public void setPolicestations(String[] policestations) {
		this.policestations = policestations;
	}

	private String[] circles;
	private String[] policestations;
	

	@Override
	public String toString() {
		return "LocationsArray [districts=" + Arrays.toString(districts) + ", sdpos=" + Arrays.toString(sdpos)
				+ ", ranks=" + Arrays.toString(ranks) + ", circles=" + Arrays.toString(circles) + ", policestations="
				+ Arrays.toString(policestations) + "]";
	}

	public String[] getDistricts() {
		return districts;
	}

	public void setDistricts(String[] districts) {
		this.districts = districts;
	}
	
}
