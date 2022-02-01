package com.bank.main.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.main.entity.Customer;
import com.bank.main.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;


	@PostMapping("/customer")
	@Transactional
	@ResponseStatus(code = HttpStatus.CREATED)
void addCustomer(@RequestBody  @Valid Customer customer){
	 customerService.addUser(customer);
	}
		
}
