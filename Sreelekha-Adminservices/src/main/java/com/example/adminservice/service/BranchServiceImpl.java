package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.BranchDao;
import com.example.adminservice.models.Branch_master;

@Service
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	BranchDao branchDao;
	
	@Override
	public Branch_master createBranch(Branch_master branch_Master) {
		// TODO Auto-generated method stub
		return branchDao.save(branch_Master);
	}

	@Override
	public String deleteBranch(String branchId) {
		// TODO Auto-generated method stub
		branchDao.deleteById(branchId);
		return "Branch deleted";
	}

	@Override
	public List<Branch_master> listAllBranch() {
		// TODO Auto-generated method stub
		
		return branchDao.findAll();
	}

}
