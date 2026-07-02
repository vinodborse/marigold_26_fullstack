package com.skillio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillio.model.AccountDetailsDTO;
import com.skillio.model.User;
import com.skillio.repository.UserRepository;

@Service
public class AccountService {

	@Autowired
	private UserRepository ur;
	@Autowired
	private HistoryService hs;
	
	public AccountDetailsDTO widhdraw(int accno, int aadhaar, int amount) {
		
		Optional<User> user = ur.findByAccNo(accno);

		if(user.isPresent()) {
			
			User myData = user.get();
			String myName = myData.getFirstname() + " " + myData.getLastname();
			if(myData.getAadhar() == aadhaar) {
				
				if(amount <= 0 || amount > myData.getBalance()) {
					
					throw new RuntimeException("Please enter valid amount");
				}
				
				int myBalance = myData.getBalance() - amount;
				myData.setBalance(myBalance);

				//myData.setBalance(myData.getBalance() + amount);
								
				ur.save(myData);
				
				hs.addEntry(accno, amount, myBalance, "Debit");
				
				AccountDetailsDTO add = new AccountDetailsDTO();
				
				add.setAccNo(accno);
				add.setName(myName);
				add.setBalance(myBalance);

				return add;
				
			} else {
				throw new RuntimeException("Account Number Or Aadhaar Number is not valid");
			}
		}else {
			throw new RuntimeException("User not found");
		}
	}

	public AccountDetailsDTO transfer(int fromAccno, int fromAadhaar, int amount, 
									  int toAccno, int toAadhaar) {
		if(fromAccno == toAccno) {
			throw new RuntimeException("Please enter valid account number");
		}
		Optional<User> myOptionalData = ur.findByAccNo(fromAccno);
		Optional<User> friendsOptionalData = ur.findByAccNo(toAccno);
		
		if(myOptionalData.isPresent() && friendsOptionalData.isPresent()) {
			User myData = myOptionalData.get();
			User friendsData = friendsOptionalData.get();
			
			if(myData.getAadhar() == fromAadhaar && friendsData.getAadhar() == toAadhaar) {
				
				if(amount <= 0 || amount > myData.getBalance()) {
					throw new RuntimeException("Please enter valid amount");
				}
				
				int myUpdatedBalance = myData.getBalance() - amount;
				
				myData.setBalance(myUpdatedBalance);
				
				int friendsUpdatedBalance = friendsData.getBalance() + amount;
				friendsData.setBalance(friendsUpdatedBalance);
				
				ur.save(myData);
				ur.save(friendsData);
				
				hs.addEntry(fromAccno, amount, myUpdatedBalance, "Debit");
				hs.addEntry(toAccno, amount, friendsUpdatedBalance, "Credit");
								
				String myName = myData.getFirstname() + " "+ myData.getLastname();
				
				return new AccountDetailsDTO(myName, myData.getAccNo(), myData.getBalance()); 

			} else {
				throw new RuntimeException("Please provide valid details");
			}
			
			
		} else {
			throw new RuntimeException("Please provide valid account numbers");
		}

	}

}
