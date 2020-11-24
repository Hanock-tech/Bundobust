package com.police.bundobustservice.model;

public class LoSkills {

	private Boolean crimeprevention;
	private Boolean sbintelligence;
	public Boolean getCrimeprevention() {
		return crimeprevention;
	}
	public void setCrimeprevention(Boolean crimeprevention) {
		this.crimeprevention = crimeprevention;
	}
	public Boolean getSbintelligence() {
		return sbintelligence;
	}
	public void setSbintelligence(Boolean sbintelligence) {
		this.sbintelligence = sbintelligence;
	}
	@Override
	public String toString() {
		return "LoSkills [crimeprevention=" + crimeprevention + ", sbintelligence=" + sbintelligence + "]";
	}
	
	
}
