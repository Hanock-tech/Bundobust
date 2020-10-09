package com.police.bundobust.model;

import java.util.Arrays;

public class DistrictArray {

	private String[] districts;

	@Override
	public String toString() {
		return "DistrictArray [districts=" + Arrays.toString(districts) + "]";
	}

	public String[] getDistricts() {
		return districts;
	}

	public void setDistricts(String[] districts) {
		this.districts = districts;
	}
	
}
