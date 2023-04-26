package com.example.adminservice.service;

import java.util.List;

import com.example.adminservice.models.Branch_master;

public interface BranchService {
	public Branch_master createBranch(Branch_master branch_Master);
	public String deleteBranch(String branchId);
	public List<Branch_master> listAllBranch();
}
