package com.bank.main.controller;

import java.math.BigDecimal;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.main.entity.Account;
import com.bank.main.service.AccountService;

@RestController
public class AccountController {
@Autowired
private AccountService accountService;

@PostMapping("/addAccount")
@Transactional
@ResponseStatus(code = HttpStatus.CREATED)
void addAccount(@RequestBody  @Valid Account account) throws Exception{
	accountService.addAccount(account);
}
@GetMapping("/{id}/balance")
public BigDecimal balanceEnquiry(@PathVariable("id") Integer id) throws Exception {
	return accountService.balanceEnquiry(id);
}
}
