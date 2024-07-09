package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Scheme {
	
	@Id
	private int schemeId;
	private String schemeName;
	private int amount;
	private String criteria;
	
	
	public Scheme() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scheme(int schemeId, String schemeName, int amount, String criteria) {
		super();
		this.schemeId = schemeId;
		this.schemeName = schemeName;
		this.amount = amount;
		this.criteria = criteria;
	}
	public int getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCriteria() {
		return criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	
	
	
	
}	