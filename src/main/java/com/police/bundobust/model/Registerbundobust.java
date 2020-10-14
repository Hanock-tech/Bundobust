package com.police.bundobust.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RegisterBundobust")

public class Registerbundobust {
	@NotNull(message = "nameofevent is mandatory field")
	@NotEmpty(message = "nameofevent is mandatory field")
	private String nameofevent;
	@NotNull(message = "district is mandatory field")
	@NotEmpty(message = "district is mandatory field")
	private String district;
	@NotNull(message = "sdpo is mandatory field")
	@NotEmpty(message = "sdpo is mandatory field")
	private String sdpo;
	@NotNull(message = "circle is mandatory field")
	@NotEmpty(message = "circle is mandatory field")
	private String circle;
	@NotNull(message = "policestation is mandatory field")
	@NotEmpty(message = "policestation is mandatory field")
	private String policestation;
	@NotNull(message = "staff is mandatory field")
	@NotEmpty(message = "staff is mandatory field")
	private String staff;
	@NotNull(message = "startdate is mandatory field")
	@NotEmpty(message = "startdate is mandatory field")
	private String startdate;
	@NotNull(message = "enddate is mandatory field")
	@NotEmpty(message = "enddate is mandatory field")
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
