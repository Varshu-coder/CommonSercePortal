package com.service;

import java.util.List;
import java.util.Map;

import com.exception.AdminNotFoundException;
import com.model.Admin;

public interface AdminService {
	
	public Admin saveAdmin(Admin a);
	
    public Admin getOneAdmin(int id);
	
	public List<Admin>getAlladmin();
	
	public Map<String,Object>deleteAdmin(int id)throws AdminNotFoundException;
	
	public Admin updateAdmin(Admin admin);
   
}