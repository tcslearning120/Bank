package com.bank.main.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BalanceEnquiry {
	@NotBlank
	@Size(max = 10)
	
	private String AccountNumber;
	@Pattern(regexp ="[0-9]+")
}
