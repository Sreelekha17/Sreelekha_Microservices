package com.example.adminservice.service;

import org.springframework.stereotype.Service;

import com.example.adminservice.models.Account_master;


public interface AccountService {
	
	public Account_master openAccount(Account_master acc);
	public String deleteAccount(String accid);
	public Account_master allAccount();
	
	

}
