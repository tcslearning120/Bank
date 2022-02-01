package com.bank.main.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.main.entity.Deposite;

import com.bank.main.service.DepositeService;

@RestController
public class DepositeController {
	
	@Autowired
	private DepositeService  depositeService;
	
	@PostMapping("/deposite")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
	void addDeposite(@RequestBody @Valid Deposite deposite)throws Exception {
		depositeService.addDeposite(deposite);
	}
	
}