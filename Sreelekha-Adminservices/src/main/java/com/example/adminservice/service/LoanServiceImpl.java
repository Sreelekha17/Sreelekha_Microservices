package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.LoanDao;
import com.example.adminservice.models.Loan_details;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanDao loanDao;
	
	@Override
	public List<Loan_details> listLoans() {
		// TODO Auto-generated method stub
		return loanDao.findAll();
	}

}
