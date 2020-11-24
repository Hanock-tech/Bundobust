package com.police.bundobustservice.model;

public class PersonalInformation {
  
	private String id;
	private String firstName;
	private String lastName;
	private String rank;
	private String district;
	private String sdpo;
	private String circle;
	private String policeStation;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
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
	public String getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	@Override
	public String toString() {
		return "PersonalInformation [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", rank="
				+ rank + ", district=" + district + ", sdpo=" + sdpo + ", circle=" + circle + ", policeStation="
				+ policeStation + "]";
	}
	
	
}
