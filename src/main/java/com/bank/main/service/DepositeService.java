package com.bank.main.service;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.main.entity.Account;
import com.bank.main.entity.Deposite;
import com.bank.main.repository.AccountRepository;
import com.bank.main.repository.DepositeRepository;


@Service
public class DepositeService {

	@Autowired
	private AccountRepository accountRepository;
	 
	@Autowired
	private DepositeRepository depositeRepository;
	

	
	public void addDeposite(@Valid Deposite deposite) throws Exception {
		// TODO Auto-generated method stub

		Integer accountNumber = Integer.parseInt(deposite.getAccoutNum());

		Account account = accountRepository.findById(accountNumber).get();

		if (account != null) {

			BigDecimal total_amount = account.getInitialDeposite();
			BigDecimal newtotal_amount = total_amount.add(deposite.getAmount());
			account.setInitialDeposite(newtotal_amount);
			account.getDeposites().add(deposite);
			accountRepository.save(account);

		} else {
			throw new Exception();
		}

		
	}

	
}
