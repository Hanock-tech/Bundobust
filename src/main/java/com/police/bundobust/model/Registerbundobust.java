package com.police.bundobust.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RegisterBundobust")

public class Registerbundobust {
 
	private String nameofevent;
	private String district;
	private String sdpo;
	private String circle;
	private String policestation;
	private String staff;
	private String startdate;
	private String enddate;
	public String getNameofevent() {
		return nameofevent;
	}
	public void setNameofevent(String nameofevent) {
		this.nameofevent = nameofevent;
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
	public String getPolicestation() {
		return policestation;
	}
	public void setPolicestation(String policestation) {
		this.policestation = policestation;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	@Override
	public String toString() {
		return "Registerbundobust [nameofevent=" + nameofevent + ", district=" + district + ", sdpo=" + sdpo
				+ ", circle=" + circle + ", policestation=" + policestation + ", staff=" + staff + ", startdate="
				+ startdate + ", enddate=" + enddate + "]";
	}
	
	
	
	
	
}
