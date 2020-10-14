package com.police.bundobust.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registerForAccess")
public class RegisterForAccess {

	@NotNull(message = "mobileNumber is mandatory field")
	@NotEmpty(message = "mobileNumber is mandatory field")
	private String mobileNumber;
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@NotEmpty(message = "password is mandatory field")
	@NotNull(message = "password is mandatory field")
	private String password;
	@NotEmpty(message = "confirmPassword is mandatory field")
	@NotNull(message = "confirmPassword is mandatory field")
	private String confirmPassword;

	@NotEmpty(message = "idNumber is mandatory field")
	@NotNull(message = "idNumber is mandatory field")
	private String idNumber;

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@NotEmpty(message = "firstName is mandatory field")
	@NotNull(message = "firstName is mandatory field")
	private String firstName;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@NotEmpty(message = "firstName is mandatory field")
	@NotNull(message = "firstName is mandatory field")
	private String lastName;

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

	@Override
	public String toString() {
		return "RegisterForAccess [mobileNumber=" + mobileNumber + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", idNumber=" + idNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

}
