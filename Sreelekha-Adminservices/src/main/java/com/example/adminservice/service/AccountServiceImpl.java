package com.example.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.adminservice.dao.AccountDao;
import com.example.adminservice.models.Account_master;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDao accountDao;

	@Override
	public Account_master openAccount(Account_master acc) {
	
		return accountDao.save(acc);
	}

	@Override
	public String deleteAccount(String account_number) {
		// TODO Auto-generated method stub
		accountDao.deleteById(account_number);
		return "Account deleted..";
	}

	@Override
	public Account_master allAccount() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
