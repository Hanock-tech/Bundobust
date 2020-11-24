package com.police.bundobustservice.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registerForAccess")
public class RegisterForAccess {

	private String _id;
	@NotEmpty(message = "mobileNumber is mandatory field")
	@NotNull(message = "mobileNumber is mandatory field")
	private String mobileNumber;
	@NotEmpty(message = "password is mandatory field")
	@NotNull(message = "password is mandatory field")

	private String password;

	@NotEmpty(message = "district is mandatory field")
	@NotNull(message = "district is mandatory field")
	private String district;

	@NotEmpty(message = "sdpo is mandatory field")
	@NotNull(message = "sdpo is mandatory field")
	private String sdpo;

	@NotEmpty(message = "circle is mandatory field")
	@NotNull(message = "circle is mandatory field")
	private String circle;

	@NotEmpty(message = "policestation is mandatory field")
	@NotNull(message = "policestation is mandatory field")
	private String policeStation;
	


	@NotEmpty(message = "firstName is mandatory field")
	@NotNull(message = "firstName is mandatory field")
	private String firstName;

	@NotEmpty(message = "firstName is mandatory field")
	@NotNull(message = "firstName is mandatory field")
	private String lastName;


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

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	
	

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	@Override
	public String toString() {
		return "RegisterForAccess [_id=" + _id + ", mobileNumber=" + mobileNumber + ", password=" + password
				+ ", district=" + district + ", sdpo=" + sdpo + ", circle=" + circle + ", policeStation="
				+ policeStation + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

}
