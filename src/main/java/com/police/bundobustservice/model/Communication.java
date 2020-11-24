package com.police.bundobustservice.model;

public class Communication {

	private Boolean yes;
	private Boolean no;
	public Boolean getYes() {
		return yes;
	}
	public void setYes(Boolean yes) {
		this.yes = yes;
	}
	public Boolean getNo() {
		return no;
	}
	@Override
	public String toString() {
		return "CommunicationSkills [yes=" + yes + ", no=" + no + "]";
	}
	public void setNo(Boolean no) {
		this.no = no;
	}

}