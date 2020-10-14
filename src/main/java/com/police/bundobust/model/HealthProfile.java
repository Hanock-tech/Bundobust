package com.police.bundobust.model;

public class HealthProfile {

	private Boolean medication;
	private String typeofmedication;
	private String reason;
	private Boolean diabetic;
	private Boolean vericonsveins;
	private Boolean anyfractures;
	private Boolean heartailment;
	private Boolean others;
	public Boolean getMedication() {
		return medication;
	}
	public void setMedication(Boolean medication) {
		this.medication = medication;
	}
	public String getTypeofmedication() {
		return typeofmedication;
	}
	public void setTypeofmedication(String typeofmedication) {
		this.typeofmedication = typeofmedication;
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
	public Boolean getVericonsveins() {
		return vericonsveins;
	}
	public void setVericonsveins(Boolean vericonsveins) {
		this.vericonsveins = vericonsveins;
	}
	public Boolean getAnyfractures() {
		return anyfractures;
	}
	public void setAnyfractures(Boolean anyfractures) {
		this.anyfractures = anyfractures;
	}
	public Boolean getHeartailment() {
		return heartailment;
	}
	public void setHeartailment(Boolean heartailment) {
		this.heartailment = heartailment;
	}
	public Boolean getOthers() {
		return others;
	}
	public void setOthers(Boolean others) {
		this.others = others;
	}
	@Override
	public String toString() {
		return "HealthProfile [medication=" + medication + ", typeofmedication=" + typeofmedication + ", reason="
				+ reason + ", diabetic=" + diabetic + ", vericonsveins=" + vericonsveins + ", anyfractures="
				+ anyfractures + ", heartailment=" + heartailment + ", others=" + others + "]";
	}
	
}
