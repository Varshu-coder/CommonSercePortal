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

import com.exception.GovernmentNotFoundException;
import com.model.Government;
import com.service.GovernmentService;

@RestController
public class GovernmentController {
	
	@Autowired
	GovernmentService govservice;
	
	@PostMapping("/addgov")
	public ResponseEntity <Government> saveScheme(@RequestBody Government g)
	{
		Government gov=govservice.saveGovernment(g);
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "useradded").body(gov);
	}
	
	@GetMapping("/getOnegov/{id}")
	public Government getOneGovernment(@PathVariable("id")int id)
	{
		return govservice.getOneGovernment(id);
	}
	
	@GetMapping("/getAllgov")
	public List<Government> getAllGovernment()
	{
		return govservice.getAllGovernment();
	}
	
	@DeleteMapping("/deletegov/{id}")
	public ResponseEntity<Map<String,Object>>deleteUser(@PathVariable("id")int id)throws GovernmentNotFoundException
	{
		Map<String,Object> response=govservice.deleteGovernment(id);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/updategov")
	public ResponseEntity<Government>UpdateScheme(@RequestBody Government gov)
	{
		Government g=govservice.updateGovernment(gov);
		return ResponseEntity.status(HttpStatus.CREATED).header("updated", "Governmentupdated").body(gov);
	}
	
	
}
	
    

