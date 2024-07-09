package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Application {
	@Id
	private int appliId;
	private String name;
	private String email;
	private long mobileNo;
	private long adharNo;
	@Lob
	@Column(length=20000)
	private byte[] incomeCerti;
	private byte[] addressProof;
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Application(int appliId, String name, String email, long mobileNo, long adharNo, byte[] incomeCerti,
			byte[] addressProof) {
		super();
		this.appliId = appliId;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.adharNo = adharNo;
		this.incomeCerti = incomeCerti;
		this.addressProof = addressProof;
	}
	public int getAppliId() {
		return appliId;
	}
	public void setAppliId(int appliId) {
		this.appliId = appliId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public byte[] getIncomeCerti() {
		return incomeCerti;
	}
	public void setIncomeCerti(byte[] incomeCerti) {
		this.incomeCerti = incomeCerti;
	}
	public byte[] getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(byte[] addressProof) {
		this.addressProof = addressProof;
	}
	
	

}
