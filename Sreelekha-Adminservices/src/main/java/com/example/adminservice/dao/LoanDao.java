package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.models.Loan_details;

@Repository
public interface LoanDao extends JpaRepository<Loan_details, String> {

}
