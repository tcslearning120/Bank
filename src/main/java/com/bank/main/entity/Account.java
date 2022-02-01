package com.bank.main.entity;


import java.math.BigDecimal;
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
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


      
@Entity

@Table(name = "accounts")

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountNumber;
	private String accountType;
	@Size
	@Pattern(regexp = "^[0-9]*$")
	private Integer customerid;
	
	@NotNull
	@DecimalMin(value="0.0")
	@Digits(integer= 10,fraction=2)
	
	@Size(min =500)
	@Pattern(regexp ="[0-9]+")
	private BigDecimal initialDeposite;
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	public BigDecimal getInitialDeposite() {
		return initialDeposite;
	}
	public void setInitialDeposite(BigDecimal initialDeposite) {
		this.initialDeposite = initialDeposite;
	}
	@OneToOne(mappedBy ="account")
	private Customer customer;
	
	 @OneToMany(mappedBy ="account" ,cascade = CascadeType.ALL , fetch = FetchType.EAGER)
		//@JoinColumn(name = "account__id_fk", referencedColumnName = "id")
	 private List<Deposite>deposites;
	 
	 
	 @OneToMany(mappedBy ="account" ,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		//@JoinColumn(name = "account__id_fk", referencedColumnName = "id")
	 private List<Withdraw>withdraws;
	 
	 
	 public List<Withdraw> getWithdraws() {
		return withdraws;
		}
		public void setWithdraws(List<Withdraw> withdraws) {
			this.withdraws = withdraws;
	}
		
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public List<Deposite> getDeposites() {
			return deposites;
		}
		public void setDeposites(List<Deposite> deposites) {
			
	 this.deposites = deposites;
		}
		
	}
