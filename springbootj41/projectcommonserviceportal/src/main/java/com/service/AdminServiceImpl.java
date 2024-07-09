package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminRepository;
import com.exception.AdminNotFoundException;
import com.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository adminRepo;

	@Override
	public Admin saveAdmin(Admin a) {
		return adminRepo.save(a);
	}
 
	@Override
	public Admin getOneAdmin(int id) {
		return adminRepo.findById(id).orElse(null);
	}

	@Override
	public List<Admin> getAlladmin() {
		return adminRepo.findAll();
	}

	@Override
	public Map<String, Object> deleteAdmin(int id) throws AdminNotFoundException 
		{
			Map<String, Object> response=new HashMap<String,Object>();
			try {
			Admin admin= adminRepo.findById(id).orElseThrow(()->new AdminNotFoundException("Admin not exist"));
			adminRepo.delete(admin);
			response.put("deleted", Boolean.TRUE);
			}
			catch(AdminNotFoundException u)
			{
				response.put("not deleted", u.getMessage());	
			}
		return null;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
    Admin a=adminRepo.findById(admin.getAdminId()).orElse(null);
		
		a.setAdminName(admin.getAdminName());
		a.setAdminId(admin.getAdminId());
		a.setAdminEmail(admin.getAdminEmail());
		return adminRepo.save(a);
	}
	
}
	
	

	