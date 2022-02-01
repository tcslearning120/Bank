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

@Table(name = "withdraw")
public class Withdraw {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer withdrawId;
	@NotBlank
	@Pattern(regexp = "[0-9]+")
	@Size(max = 10)
	private String accountNumber;
	@Size(min = 0)
	@Pattern(regexp = "[0-9]+")
	private BigDecimal amount;

	public Withdraw() {
	};

	public Withdraw(Integer withdrawId, @NotBlank @Pattern(regexp = "[0-9]+") @Size(max = 10) String accountNumber,
			@Size(min = 0) @Pattern(regexp = "[0-9]+") BigDecimal amount, Account account) {
		super();
		this.withdrawId = withdrawId;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.account = account;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "account_id_fk", referencedColumnName = "accountNumber")
	private Account account;

	public Integer getWithdrawId() {
		return withdrawId;
	}

	public void setWithdrawId(Integer withdrawId) {
		this.withdrawId = withdrawId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
