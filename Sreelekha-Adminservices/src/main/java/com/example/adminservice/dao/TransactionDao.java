package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.models.Transaction_details;

@Repository
public interface TransactionDao extends JpaRepository<Transaction_details, String> {

}
