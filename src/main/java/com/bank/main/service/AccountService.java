 package com.bank.main.service;

import java.math.BigDecimal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.main.entity.Account;
import com.bank.main.entity.Customer;
import com.bank.main.repository.AccountRepository;
import com.bank.main.repository.CustomerRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;
	
	public void addAccount(Account account) throws Exception {
		
		Integer customerid = account.getCustomerid();
		
		Customer customer = customerRepository.findById(customerid).get();
		
		if(customer != null) {
			
			if(customer.getAccount() == null) {
				
				customer.setAccount(account);
				accountRepository.save(account);
				customerRepository.save(customer);
				
		                                    	} 
			else {
				throw new Exception("customer already has an account");
			     }
			
		} 
		
		else {
			throw new Exception("customer with this id dosen't exists");
		      }

	
	}

	public BigDecimal balanceEnquiry(Integer id) throws Exception {
		Account account =accountRepository.findById(id).get();
	
		if(account != null) {
			return account.getInitialDeposite();
			
		}
		throw new Exception("id doesnot exists");
		}
		
		
	}
		
		
		
		
		
		
		
		
		
	

