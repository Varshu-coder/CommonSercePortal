package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.AdminNotFoundException;
import com.model.Admin;
import com.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public ResponseEntity <Admin> saveScheme(@RequestBody Admin a)
	{
		Admin admin=adminService.saveAdmin(a);
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "adminadded").body(admin);
	}
	
	@GetMapping("/getOneadmin/{id}")
	public Admin getOneAdmin(@PathVariable("id")int id)
	{
		return adminService.getOneAdmin(id);
	}
	
	@GetMapping("/getAlladmin")
	public List<Admin> getAlladmin()
	{
		return adminService.getAlladmin();
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public ResponseEntity<Map<String,Object>>deleteAdmin(@PathVariable("id")int id)throws AdminNotFoundException
	{
		Map<String,Object> response=adminService.deleteAdmin(id);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/updateAdmin")
	public ResponseEntity<Admin>UpdateAdmin(@RequestBody Admin admin)
	{
		Admin a=adminService.updateAdmin(admin);
		return ResponseEntity.status(HttpStatus.CREATED).header("updated", "Adminupdated").body(admin);
	}
	
	
}


