package com.police.bundobust.model;

public class AddressForCorrespondence {

	private TemporaryAddress temporarayaddress;
	private PermenantAddress permenantaddress;
	public TemporaryAddress getTemporarayaddress() {
		return temporarayaddress;
	}
	public void setTemporarayaddress(TemporaryAddress temporarayaddress) {
		this.temporarayaddress = temporarayaddress;
	}
	public PermenantAddress getPermenantaddress() {
		return permenantaddress;
	}
	public void setPermenantaddress(PermenantAddress permenantaddress) {
		this.permenantaddress = permenantaddress;
	}
	@Override
	public String toString() {
		return "AddressForCorrespondence [temporarayaddress=" + temporarayaddress + ", permenantaddress="
				+ permenantaddress + "]";
	}
	
}
