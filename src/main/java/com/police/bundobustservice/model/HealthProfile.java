package com.police.bundobustservice.model;

public class HealthProfile {

	private Boolean medication;
	private String typeOfMedication;
	private String reason;
	private Boolean diabetic;
	private Boolean vericonsVeins;
	private Boolean anyFractures;
	private Boolean heartaAilment;
	private Boolean others;
	
	public Boolean getMedication() {
		return medication;
	}
	public void setMedication(Boolean medication) {
		this.medication = medication;
	}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Boolean getDiabetic() {
		return diabetic;
	}
	public void setDiabetic(Boolean diabetic) {
		this.diabetic = diabetic;
	}
	
	public Boolean getOthers() {
		return others;
	}
	public void setOthers(Boolean others) {
		this.others = others;
	}
	public String getTypeOfMedication() {
		return typeOfMedication;
	}
	public void setTypeOfMedication(String typeOfMedication) {
		this.typeOfMedication = typeOfMedication;
	}
	public Boolean getVericonsVeins() {
		return vericonsVeins;
	}
	public void setVericonsVeins(Boolean vericonsVeins) {
		this.vericonsVeins = vericonsVeins;
	}
	public Boolean getAnyFractures() {
		return anyFractures;
	}
	public void setAnyFractures(Boolean anyFractures) {
		this.anyFractures = anyFractures;
	}
	public Boolean getHeartaAilment() {
		return heartaAilment;
	}
	public void setHeartaAilment(Boolean heartaAilment) {
		this.heartaAilment = heartaAilment;
	}
	@Override
	public String toString() {
		return "HealthProfile [medication=" + medication + ", typeOfMedication=" + typeOfMedication + ", reason="
				+ reason + ", diabetic=" + diabetic + ", vericonsVeins=" + vericonsVeins + ", anyFractures="
				+ anyFractures + ", heartaAilment=" + heartaAilment + ", others=" + others + "]";
	}
	
	
	
}
