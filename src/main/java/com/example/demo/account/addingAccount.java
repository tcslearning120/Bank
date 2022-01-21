package com.example.demo.account;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class addingAccount {
	@NotNull
	@Size(max = 10)
	private String customerID;
	private String accountType;
	@NotNull
	@Size(min =500)
	@Pattern(regexp ="[0-9]+")
	private String initialDeposite;
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getInittialDeposite() {
		return initialDeposite;
	}
	public void setInittialDeposite(String inittialDeposite) {
		this.initialDeposite = inittialDeposite;
	}
}