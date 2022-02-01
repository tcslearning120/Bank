package com.bank.main.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bank.main.entity.Withdraw;
import com.bank.main.service.WithdrawService;

public class WithdrawController {
	@Autowired
	private WithdrawService  withdrawService;
	@PostMapping("/withdraw")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void removeFromDeposite(@RequestBody @Valid Withdraw withdraw)throws Exception {
		withdrawService.removeFromDeposite(withdraw);
	}
	
}
