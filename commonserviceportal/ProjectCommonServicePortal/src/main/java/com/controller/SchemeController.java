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

import com.exception.SchemeNotFoundException;
import com.model.Scheme;
import com.service.SchemeService;

@RestController
public class SchemeController {
	@Autowired
	SchemeService schemeservice;
	
	@PostMapping("/addscheme")
	public ResponseEntity <Scheme> saveScheme(@RequestBody Scheme s)
	{
		Scheme scheme=schemeservice.saveScheme(s);
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "useradded").body(scheme);
	}
	/*
	@GetMapping("/getOnescheme/{id}")
	public Scheme getOneScheme(@PathVariable("id")int id)
	{
		return schemeservice.getOneScheme(id);
	}
	
	@GetMapping("/getAllscheme")
	public List<Scheme> getAllscheme()
	{
		return schemeservice.getAllscheme();
	}
	
	@DeleteMapping("/deleteScheme/{id}")
	public ResponseEntity<Map<String,Object>>deleteUser(@PathVariable("id")int id)throws SchemeNotFoundException
	{
		Map<String,Object> response=schemeservice.deleteScheme(id);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/updateScheme")
	public ResponseEntity<Scheme>UpdateScheme(@RequestBody Scheme scheme)
	{
		Scheme s=schemeservice.updateScheme(scheme);
		return ResponseEntity.status(HttpStatus.CREATED).header("updated", "schemeupdated").body(scheme);
	}*/
	
	
}
