package com.police.bundobust.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="PersonalInformation")
public class PersonalInfo {
	
	private LoSkills loskills;
	private ProfessionalSkills professinalskills;
	private PublicPresonalRelation personalrelation;
	private CommunicationSkills comskills;
	private LanguagesKnown languagesknown;
	private PostingInfo postinginfo;
	private BankDetails bankdetails;
	private AddressForCorrespondence address;
	private HealthProfile healthprofile;
	
	
	public LoSkills getLoskills() {
		return loskills;
	}
	public void setLoskills(LoSkills loskills) {
		this.loskills = loskills;
	}
	@Override
	public String toString() {
		return "PersonalInfo [loskills=" + loskills + ", professinalskills=" + professinalskills + ", personalrelation="
				+ personalrelation + ", comskills=" + comskills + ", languagesknown=" + languagesknown
				+ ", postinginfo=" + postinginfo + ", bankdetails=" + bankdetails + ", address=" + address
				+ ", healthprofile=" + healthprofile + "]";
	}
	public ProfessionalSkills getProfessinalskills() {
		return professinalskills;
	}
	public void setProfessinalskills(ProfessionalSkills professinalskills) {
		this.professinalskills = professinalskills;
	}
	public PublicPresonalRelation getPersonalrelation() {
		return personalrelation;
	}
	public void setPersonalrelation(PublicPresonalRelation personalrelation) {
		this.personalrelation = personalrelation;
	}
	public CommunicationSkills getComskills() {
		return comskills;
	}
	public void setComskills(CommunicationSkills comskills) {
		this.comskills = comskills;
	}
	public LanguagesKnown getLanguagesknown() {
		return languagesknown;
	}
	public void setLanguagesknown(LanguagesKnown languagesknown) {
		this.languagesknown = languagesknown;
	}
	public PostingInfo getPostinginfo() {
		return postinginfo;
	}
	public void setPostinginfo(PostingInfo postinginfo) {
		this.postinginfo = postinginfo;
	}
	public BankDetails getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}
	public AddressForCorrespondence getAddress() {
		return address;
	}
	public void setAddress(AddressForCorrespondence address) {
		this.address = address;
	}
	public HealthProfile getHealthprofile() {
		return healthprofile;
	}
	public void setHealthprofile(HealthProfile healthprofile) {
		this.healthprofile = healthprofile;
	}
	

}
