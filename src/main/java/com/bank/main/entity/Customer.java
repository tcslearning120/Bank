package com.bank.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custAccid;
	@NotNull
	@NotBlank
	@Size(max = 25)
	@Pattern(regexp = "^[a-zA-Z]*$")
	private String custName;
	@NotBlank
	@NotNull
	private String gender;
	@NotBlank
	@DateTimeFormat(pattern = "DD-MON-YY")
	private String dob;
	@NotBlank
	@NotNull
	@Size(max = 50)
	private String address;
	@NotBlank
	@NotNull
	@Size(max = 50)
	private String city;

	private String state;
	private String pin;
	private String telephoneNumber;
	private String fax;

	public Customer() {
	}

	public Customer(Integer custAccid,
			@NotNull @NotBlank @Size(max = 25) @Pattern(regexp = "^[a-zA-Z]*$") String custName,
			@NotBlank @NotNull String gender, @NotBlank String dob, @NotBlank @NotNull @Size(max = 50) String address,
			@NotBlank @NotNull @Size(max = 50) String city, String state, String pin, String telephoneNumber,
			String fax, Account account) {
		super();
		this.custAccid = custAccid;
		this.custName = custName;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.telephoneNumber = telephoneNumber;
		this.fax = fax;
		this.account = account;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id_fk", referencedColumnName = "accountNumber")
	private Account account;

	public Integer getCustAccid() {
		return custAccid;
	}

	public void setCustAccid(Integer custAccid) {
		this.custAccid = custAccid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
