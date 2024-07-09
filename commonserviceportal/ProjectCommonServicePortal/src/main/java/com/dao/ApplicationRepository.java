package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Application;

public interface ApplicationRepository extends JpaRepository<Application,Integer>{

}
