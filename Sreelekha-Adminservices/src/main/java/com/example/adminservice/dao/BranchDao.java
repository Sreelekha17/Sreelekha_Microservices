package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.models.Branch_master;

@Repository
public interface BranchDao extends JpaRepository<Branch_master, String> {

}
