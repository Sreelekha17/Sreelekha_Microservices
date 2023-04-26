package com.example.adminservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.models.Account_master;
import com.example.adminservice.models.Branch_master;
import com.example.adminservice.models.Loan_details;
import com.example.adminservice.service.AccountService;
import com.example.adminservice.service.BranchService;
import com.example.adminservice.service.LoanService;

@RestController
public class AdminController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	BranchService branchService;
	
	@Autowired
	LoanService loanService;
	
	@GetMapping("/")
	public String home() {
		return "Hello Admin";
	}
	
	@PostMapping("/createAcc")
	public Account_master saveAccount(@RequestBody Account_master acc) {
		accountService.openAccount(acc);
		return acc;
	}
	
	@DeleteMapping("/deleteAccount/{accountNo}")
	public String deleteAccount(@PathVariable(name="accountNo") String accountNo) {
		accountService.deleteAccount(accountNo);
		return "Account deleted";
	}
	

	@PostMapping("/createBranch")
	public Branch_master createBranch(@RequestBody Branch_master branchMaster) {
		branchService.createBranch(branchMaster);
		return branchMaster;
	}
	
	@DeleteMapping("/deleteBranch/{branchId}")
	public String deleteBranch(@PathVariable(name="branchId") String branchId) {
		branchService.deleteBranch(branchId);
		return "Branch deleted.";
	}
	
	@GetMapping("/allBranches")
	public List<Branch_master> getAllBranches(){
		return branchService.listAllBranch();
	}
	
	@GetMapping("/allLoans")
	public List<Loan_details> loanList(){
		return loanService.listLoans();
	}

}
