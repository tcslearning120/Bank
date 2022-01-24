package com.bank.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.main.BankUserRepository;
import com.bank.main.entity.UserData;

public class BankUserService {
	@Autowired //DI
	BankUserRepository userRepository;
     //    public void   getUsers(){
       //     	return   userRepositery.findAll();
            	
            
		public void saveUser(UserData user) {
			// TODO Auto-generated method stub
			userRepository.save(user);
			
		}
}
