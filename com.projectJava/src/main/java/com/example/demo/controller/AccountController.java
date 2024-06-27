package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountService;
@RestController
public class AccountController {

	
	@PostMapping("/saveAccount")
	public String saveAccount(@RequestBody Account ac) {
		//TODO: process POST request
		// create a object for service class
		AccountService account = new AccountService();
		
		// pass the ac object  to SaveAccount
		account.SaveAccount(ac);
		
		return "ok";
	}
	
}
