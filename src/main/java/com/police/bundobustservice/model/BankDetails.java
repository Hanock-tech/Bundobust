package com.police.bundobustservice.model;

public class BankDetails {

	private String bankAccountHolderName;
	private String accountNumber;
	private String bankName;
	private String ifscCode;
	public String getBankAccountHolderName() {
		return bankAccountHolderName;
	}
	public void setBankAccountHolderName(String bankAccountHolderName) {
		this.bankAccountHolderName = bankAccountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "BankDetails [bankAccountHolderName=" + bankAccountHolderName + ", accountNumber=" + accountNumber
				+ ", bankName=" + bankName + ", ifscCode=" + ifscCode + "]";
	}
		
}
