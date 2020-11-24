package com.police.bundobustservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profiledata")
public class CreateProfile {
    
	private String id;
	private PersonalInformation personalInformation;
	private Skills skills;
	private BankDetails bankDetails;
	private Address address;
	private HealthProfile healthProfile;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public HealthProfile getHealthProfile() {
		return healthProfile;
	}

	public void setHealthProfile(HealthProfile healthProfile) {
		this.healthProfile = healthProfile;
	}

	@Override
	public String toString() {
		return "CreateProfile [personalInformation=" + personalInformation + ", skills=" + skills + ", bankDetails="
				+ bankDetails + ", address=" + address + ", healthProfile=" + healthProfile + "]";
	}
}
