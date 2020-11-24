package com.police.bundobustservice.model;

public class LocationDetails {

	private String  district;
	private String sdpo;
	private String circle;
	private String policestation;
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getSdpo() {
		return sdpo;
	}
	public void setSdpo(String sdpo) {
		this.sdpo = sdpo;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public String getPolicestation() {
		return policestation;
	}
	public void setPolicestation(String policestation) {
		this.policestation = policestation;
	}
	@Override
	public String toString() {
		return "LocationDetails [district=" + district + ", sdpo=" + sdpo + ", circle=" + circle + ", policestation="
				+ policestation + "]";
	}
	
	
}
