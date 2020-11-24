package com.police.bundobustservice.model;

public class MyStaff {

	private String sno ;
	private String name;
	
	private String journalIdNo;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	@Override
	public String toString() {
		return "MystaffDemo [sno=" + sno + ", name=" + name + ", journalIdNo=" + journalIdNo + ", rank=" + rank
				+ ", district=" + district + ", sdpo=" + sdpo + ", circle=" + circle + ", policestation="
				+ policestation + ", mobileNo=" + mobileNo + ", status=" + status + ", profile=" + profile + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJournalIdNo() {
		return journalIdNo;
	}
	public void setJournalIdNo(String journalIdNo) {
		this.journalIdNo = journalIdNo;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	private String rank; 
	private String district;
	private String sdpo;
	private String circle;
	private String policestation;
	private String mobileNo ;
	private String status;
	private String profile;

}
