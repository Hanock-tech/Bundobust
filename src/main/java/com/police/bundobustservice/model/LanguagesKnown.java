package com.police.bundobustservice.model;

public class LanguagesKnown {

	private Boolean english;
	private Boolean telugu;
	private Boolean hindi;
	private Boolean urdu;
	private Boolean oriya;
	private Boolean tamil;
	private Boolean marathi;
	private Boolean malyalam;
	private Boolean kannada;
	private Boolean anyothertriblelanguage;
	
	public Boolean getEnglish() {
		return english;
	}
	public void setEnglish(Boolean english) {
		this.english = english;
	}
	public Boolean getTelugu() {
		return telugu;
	}
	public void setTelugu(Boolean telugu) {
		this.telugu = telugu;
	}
	public Boolean getHindi() {
		return hindi;
	}
	public void setHindi(Boolean hindi) {
		this.hindi = hindi;
	}
	public Boolean getUrdu() {
		return urdu;
	}
	public void setUrdu(Boolean urdu) {
		this.urdu = urdu;
	}
	public Boolean getOriya() {
		return oriya;
	}
	public void setOriya(Boolean oriya) {
		this.oriya = oriya;
	}
	public Boolean getTamil() {
		return tamil;
	}
	public void setTamil(Boolean tamil) {
		this.tamil = tamil;
	}
	public Boolean getMarathi() {
		return marathi;
	}
	public void setMarathi(Boolean marathi) {
		this.marathi = marathi;
	}
	public Boolean getMalyalam() {
		return malyalam;
	}
	public void setMalyalam(Boolean malyalam) {
		this.malyalam = malyalam;
	}
	public Boolean getKannada() {
		return kannada;
	}
	public void setKannada(Boolean kannada) {
		this.kannada = kannada;
	}
	public Boolean getAnyothertriblelanguage() {
		return anyothertriblelanguage;
	}
	public void setAnyothertriblelanguage(Boolean anyothertriblelanguage) {
		this.anyothertriblelanguage = anyothertriblelanguage;
	}
	
	
	@Override
	public String toString() {
		return "LanguagesKnown [english=" + english + ", telugu=" + telugu + ", hindi=" + hindi + ", urdu=" + urdu
				+ ", oriya=" + oriya + ", tamil=" + tamil + ", marathi=" + marathi + ", malyalam=" + malyalam
				+ ", kannada=" + kannada + ", anyothertriblelanguage=" + anyothertriblelanguage + "]";
	}
}
