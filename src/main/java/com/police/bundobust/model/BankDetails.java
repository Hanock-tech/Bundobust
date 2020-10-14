package com.police.bundobust.model;

public class BankDetails {

	private String bankholdername;
	private String accountnumber;
	private String bankname;
	private String ifsccode;
	public String getBankholdername() {
		return bankholdername;
	}
	public void setBankholdername(String bankholdername) {
		this.bankholdername = bankholdername;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	@Override
	public String toString() {
		return "BankDetails [bankholdername=" + bankholdername + ", accountnumber=" + accountnumber + ", bankname="
				+ bankname + ", ifsccode=" + ifsccode + "]";
	}
	
	
	
}
