package com.bank.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bank.main.entity.UserData;
import com.bank.main.service.BankUserService;


@RestController
public class UserController {
	@Autowired
	BankUserService userService;
	@GetMapping ("/user")
	void getUsers(){
	//	return userService.getUsers();
	System.out.println("testing");
	}
	@PostMapping("/user")
	@ResponseStatus(code = HttpStatus.CREATED)
void createUser(@RequestBody  @Valid UserData user){
		System.out.println(user.getName());
	userService.saveUser(user);
}
}

