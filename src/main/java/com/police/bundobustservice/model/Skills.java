package com.police.bundobustservice.model;

public class Skills {
	
	private Professional professinalSkills;
	private PublicPresonalRelation personalRelation;
	private Communication commnication;
	private LanguagesKnown languagesKnown;
	public Professional getProfessinalSkills() {
		return professinalSkills;
	}
	public void setProfessinalSkills(Professional professinalSkills) {
		this.professinalSkills = professinalSkills;
	}
	public PublicPresonalRelation getPersonalRelation() {
		return personalRelation;
	}
	public void setPersonalRelation(PublicPresonalRelation personalRelation) {
		this.personalRelation = personalRelation;
	}
	public Communication getCommnication() {
		return commnication;
	}
	public void setCommnication(Communication commnication) {
		this.commnication = commnication;
	}
	
	public LanguagesKnown getLanguagesKnown() {
		return languagesKnown;
	}
	public void setLanguagesKnown(LanguagesKnown languagesKnown) {
		this.languagesKnown = languagesKnown;
	}
	@Override
	public String toString() {
		return "Skills [professinalSkills=" + professinalSkills + ", personalRelation=" + personalRelation
				+ ", commnication=" + commnication + ", languagesKnown=" + languagesKnown + "]";
	}
	

}
