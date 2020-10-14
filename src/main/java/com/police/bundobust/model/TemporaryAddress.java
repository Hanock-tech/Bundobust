package com.police.bundobust.model;

public class TemporaryAddress {

	private String Addressline;
	private String streetcolonyname;
	private String city;
	private String district;
	private String pincode;
	private String state;
	public String getAddressline() {
		return Addressline;
	}
	public void setAddressline(String addressline) {
		Addressline = addressline;
	}
	public String getStreetcolonyname() {
		return streetcolonyname;
	}
	public void setStreetcolonyname(String streetcolonyname) {
		this.streetcolonyname = streetcolonyname;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "TemporaryAddress [Addressline=" + Addressline + ", streetcolonyname=" + streetcolonyname + ", city="
				+ city + ", district=" + district + ", pincode=" + pincode + ", state=" + state + "]";
	}
	
	
	
}
