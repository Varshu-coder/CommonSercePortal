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
import com.exception.ApplicationNotFoundException;
import com.model.Admin;
import com.model.Application;
import com.service.ApplicationService;

@RestController
public class ApplicationController {
	
	@Autowired
	ApplicationService appliService;
	
	
	@PostMapping("/addAppli")
	public ResponseEntity <Application> saveAppli(@RequestBody Application a)
	{
		Application appli=appliService.saveAppli(a);
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "appliadded").body(appli);
	}
	
	@GetMapping("/getOneappli/{id}")
	public Application getOneAppli(@PathVariable("id")int id)
	{
		return appliService.getOneAppli(id);
	}
	
	@GetMapping("/getAllappli")
	public List<Application> getAllappli()
	{
		return appliService.getAllappli();
	}
	
	@DeleteMapping("/deleteAppli/{id}")
	public ResponseEntity<Map<String,Object>>deleteAppli(@PathVariable("id")int id)throws ApplicationNotFoundException
	{
		Map<String,Object> response=appliService.deleteAppli(id);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/updateAppli")
	public ResponseEntity<Application>UpdateAppli(@RequestBody Application appli)
	{
		Application a=appliService.updateAppli(appli);
		return ResponseEntity.status(HttpStatus.CREATED).header("updated", "Adminupdated").body(appli);
	}
	

}
