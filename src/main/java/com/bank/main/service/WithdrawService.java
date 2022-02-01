package com.bank.main.service;
import java.math.BigDecimal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.main.entity.Account;
import com.bank.main.entity.Withdraw;
import com.bank.main.repository.AccountRepository;
import com.bank.main.repository.WithdrawRepository;


@Service
public class WithdrawService {

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private WithdrawRepository withdrawRepository;
	
	public void removeFromDeposite( Withdraw withdraw) throws Exception {
		
		Integer accountNumber = Integer.parseInt(withdraw.getAccountNumber());
		
		Account account = accountRepository.findById(accountNumber).get();
		
		if(account != null) {
			
			BigDecimal total_amount =  account.getInitialDeposite();
			BigDecimal newtotal_amount = total_amount .subtract(withdraw.getAmount());
			account.setInitialDeposite(newtotal_amount);
			account.getWithdraws().add(withdraw);
			accountRepository.save(account);
			
		} else {
			throw new Exception();
		}
	}

}
