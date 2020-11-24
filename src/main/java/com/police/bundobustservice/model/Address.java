package com.police.bundobustservice.model;

public class Address {

	private TemporaryAddress temporarayAddress;
	private PermenantAddress permenantAddress;

	public TemporaryAddress getTemporarayAddress() {
		return temporarayAddress;
	}

	public void setTemporarayAddress(TemporaryAddress temporarayAddress) {
		this.temporarayAddress = temporarayAddress;
	}

	public PermenantAddress getPermenantAddress() {
		return permenantAddress;
	}

	public void setPermenantAddress(PermenantAddress permenantAddress) {
		this.permenantAddress = permenantAddress;
	}

	@Override
	public String toString() {
		return "Address [temporarayAddress=" + temporarayAddress + ", permenantAddress=" + permenantAddress + "]";
	}

}
