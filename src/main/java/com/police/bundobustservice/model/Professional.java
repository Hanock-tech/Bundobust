package com.police.bundobustservice.model;

public class Professional {

	private Boolean firstaid;
	private Boolean computers;
	private Boolean driving;
	private Boolean electrician;
	private Boolean plumber;
	private Boolean swimming;
	public Boolean getFirstaid() {
		return firstaid;
	}
	public void setFirstaid(Boolean firstaid) {
		this.firstaid = firstaid;
	}
	public Boolean getComputers() {
		return computers;
	}
	public void setComputers(Boolean computers) {
		this.computers = computers;
	}
	public Boolean getDriving() {
		return driving;
	}
	public void setDriving(Boolean driving) {
		this.driving = driving;
	}
	public Boolean getElectrician() {
		return electrician;
	}
	public void setElectrician(Boolean electrician) {
		this.electrician = electrician;
	}
	public Boolean getPlumber() {
		return plumber;
	}
	public void setPlumber(Boolean plumber) {
		this.plumber = plumber;
	}
	public Boolean getSwimming() {
		return swimming;
	}
	public void setSwimming(Boolean swimming) {
		this.swimming = swimming;
	}
	@Override
	public String toString() {
		return "ProfessionalSkills [firstaid=" + firstaid + ", computers=" + computers + ", driving=" + driving
				+ ", electrician=" + electrician + ", plumber=" + plumber + ", swimming=" + swimming + "]";
	}
	
}
