package com.police.bundobust.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="RegisterDetails")
public class RegisterForAccess {

	@NotEmpty(message="useraname is mandatory field")
	private String userName;
	@NotEmpty(message="password is mandatory field")
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String rank;
	private String district;
	private String sdpo;
	private String circle;
	private String policeStation;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
		return "RegisterForAcsess [userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", rank=" + rank
				+ ", district=" + district + ", sdpo=" + sdpo + ", circle=" + circle + ", policeStation="
				+ policeStation + "]";
	}
	
	
}
