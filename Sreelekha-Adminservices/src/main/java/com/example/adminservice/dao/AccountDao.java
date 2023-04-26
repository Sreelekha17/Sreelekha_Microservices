package com.example.adminservice.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.models.Account_master;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AccountDao extends JpaRepository<Account_master,String> {
	
	

}
