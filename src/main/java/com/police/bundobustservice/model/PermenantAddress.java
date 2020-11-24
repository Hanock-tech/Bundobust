package com.police.bundobustservice.model;

public class PermenantAddress {

	private String addressLine;
	private String streetName;
	private String city;
	private String district;
	private String pinCode;
	private String state;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "PermenantAddress [addressLine=" + addressLine + ", streetName=" + streetName + ", city=" + city
				+ ", district=" + district + ", pinCode=" + pinCode + ", state=" + state + "]";
	}

	
}
