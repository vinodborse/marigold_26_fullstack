package com.skillio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.AccountDetailsDTO;
import com.skillio.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService as;
	
	@PutMapping("/widhdraw")
	public AccountDetailsDTO widhdraw(	@RequestParam("accno") int accno, 
										@RequestParam("aadhaar") int aadhaar, 
										@RequestParam("amount") int amount) {
		return as.widhdraw(accno, aadhaar, amount);
	}
	

	@PutMapping("/transfer")
	public AccountDetailsDTO transfer( 	@RequestParam("from") int fromAccno, 
										 @RequestParam("fromAadhaar") int fromAadhaar, 
										 @RequestParam("amount") int amount, 
										 @RequestParam("to") int toAccountno, 
										 @RequestParam("toAadhaar") int toAadhaar) {
		
		return as.transfer(fromAccno, fromAadhaar, amount, toAccountno, toAadhaar);
	}
}
