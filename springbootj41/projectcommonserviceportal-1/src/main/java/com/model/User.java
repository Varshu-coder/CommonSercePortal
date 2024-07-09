package com.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
	
	@Id
	
	private int userId;
	private String userName;
	private String userEmail;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Scheme> scheme;

	public User() {
		super();
	}

	public User(int userId, String userName, String userEmail, List<Scheme> scheme) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.scheme = scheme;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<Scheme> getScheme() {
		return scheme;
	}

	public void setScheme(List<Scheme> scheme) {
		this.scheme = scheme;
	}
	
	
	

	
	
}

