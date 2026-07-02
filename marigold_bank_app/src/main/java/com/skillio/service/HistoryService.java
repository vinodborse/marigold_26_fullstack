package com.skillio.service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillio.model.History;
import com.skillio.repository.HistoryRepository;

@Service
public class HistoryService {
	@Autowired
	HistoryRepository hr;
	
	public void addEntry(int accno, int amount, int balance, String type) {
		
		History history = new History();
		history.setAccNo(accno);
		history.setAmount(amount);
		history.setBalance(balance);
		history.setDate(LocalDate.now());
		history.setType(type);
		Random rd = new Random();
		
		boolean notUniqueTnId = true;
		
		while(notUniqueTnId) {
			int tnId = rd.nextInt(10000);
			Optional<History> availableHistory =  hr.findByTransactionId(tnId);
			
			if(!availableHistory.isPresent()) {
				history.setTransactionId(tnId);
				notUniqueTnId = false;
			}
		}
						
		hr.save(history);

	}
	
	
}
