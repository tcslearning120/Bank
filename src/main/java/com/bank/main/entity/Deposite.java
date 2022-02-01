package com.bank.main.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Entity

@Table(name = "deposite")
public class Deposite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer depositeId;
	@NotBlank
	@Pattern(regexp = "[0-9]+")
	@Size(max = 10)
	private String accoutNum;
	@Pattern(regexp = "[0-9]+")
	private BigDecimal amount;

	public Deposite() {
	};

	public Deposite(Integer depositeId, @NotBlank @Pattern(regexp = "[0-9]+") @Size(max = 10) String accoutNum,
			@Pattern(regexp = "[0-9]+") BigDecimal amount, Account account, String description) {
		super();
		this.depositeId = depositeId;
		this.accoutNum = accoutNum;
		this.amount = amount;
		this.account = account;
		Description = description;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "account_id_fk", referencedColumnName = "accountNumber")
	private Account account;

	public Integer getDepositeId() {
		return depositeId;
	}

	public void setDepositeId(Integer depositeId) {
		this.depositeId = depositeId;
	}

	public String getAccoutNum() {
		return accoutNum;
	}

	public void setAccoutNum(String accoutNum) {
		this.accoutNum = accoutNum;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	private String Description;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
