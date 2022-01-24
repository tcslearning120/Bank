package com.bank.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Entity
public class UserData {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotBlank
	@Size(max = 25)
	private Integer Name;
	@NotBlank
	private String gender;
	@NotBlank
	@DateTimeFormat(pattern = "DD-MON-YY")
	private String dob;
	@NotBlank
	@Size(max = 50)
	private String address;
	@Size(max = 50)
	private String city;

	private String state;
	private String pin;
	private String TelephoneNumber;
	private String Fax;

	public Integer getName() {
		return Name;
	}

	public void setName(Integer name) {
		Name = name;
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

	public String getTelephoneNumber() {
		return TelephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		TelephoneNumber = telephoneNumber;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

}
