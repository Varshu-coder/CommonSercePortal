package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Government {

	@Id
	private int govId;
	private String govName;

	@OneToMany(fetch = FetchType.EAGER)
	private List<Scheme> scheme;

	public Government() {
		super();
	}

	public Government(int govId, String govName, List<Scheme> scheme) {
		super();
		this.govId = govId;
		this.govName = govName;
		this.scheme = scheme;
	}

	public int getGovId() {
		return govId;
	}

	public void setGovId(int govId) {
		this.govId = govId;
	}

	public String getGovName() {
		return govName;
	}

	public void setGovName(String govName) {
		this.govName = govName;
	}

	public List<Scheme> getScheme() {
		return scheme;
	}

	public void setScheme(List<Scheme> scheme) {
		this.scheme = scheme;
	}

}
