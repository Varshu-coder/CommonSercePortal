package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Government;

public interface GovernmentRepository extends JpaRepository<Government,Integer> {
	
	
}
