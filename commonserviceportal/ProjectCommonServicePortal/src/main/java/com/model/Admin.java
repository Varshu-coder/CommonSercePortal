package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	private int adminId;
	private String adminName;
	private String adminEmail;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Scheme>scheme;

	public Admin() {
		super();
	}

	public Admin(int adminId, String adminName, String adminEmail, List<Scheme> scheme) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.scheme = scheme;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public List<Scheme> getScheme() {
		return scheme;
	}

	public void setScheme(List<Scheme> scheme) {
		this.scheme = scheme;
	}
	
	
}    