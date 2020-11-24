package com.police.bundobustservice.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "eventsData")

public class Registerbundobust {
	
	
	private String _id;
	
	@NotNull(message = "nameofevent is mandatory field")
	@NotEmpty(message = "nameofevent is mandatory field")
	private String nameOfEvent;
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
	private String policeStation;
	@NotNull(message = "staff is mandatory field")
	@NotEmpty(message = "staff is mandatory field")
	private String requriedStaff;
	@NotNull(message = "startdate is mandatory field")
	@NotEmpty(message = "startdate is mandatory field")
	private String startDate;
	@NotNull(message = "enddate is mandatory field")
	@NotEmpty(message = "enddate is mandatory field")
	private String endDate;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
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
	public String getPoliceStation() {
		return policeStation;
	}
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}
	public String getRequriedStaff() {
		return requriedStaff;
	}
	public void setRequriedStaff(String requriedStaff) {
		this.requriedStaff = requriedStaff;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Registerbundobust [_id=" + _id + ", nameOfEvent=" + nameOfEvent + ", district=" + district + ", sdpo="
				+ sdpo + ", circle=" + circle + ", policeStation=" + policeStation + ", requriedStaff=" + requriedStaff
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	
	
}
