package com.bank.main.service;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.main.entity.Customer;
import com.bank.main.repository.CustomerRepository;
import com.bank.main.repository.DepositeRepository;

@Service
public class CustomerService {
	@Autowired // DI
	private CustomerRepository customerRepository;
 @Autowired
 private DepositeRepository depositeRepository;



	public void addUser(@Valid Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
	}
		

	
}
