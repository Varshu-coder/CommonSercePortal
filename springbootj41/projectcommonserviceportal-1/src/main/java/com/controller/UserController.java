package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping("/u")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<User>saveUser(@RequestBody User u)
	{
		User user=userService.saveUser(u);
		
		return ResponseEntity.status(HttpStatus.CREATED).header("add","User added").body(user);
	}
	/*
	@GetMapping("/getOneUser/{id}")
	public User getOneUser(@PathVariable("id")int id)
	{
	   return userService.getOneUser(id);	
	}
	
	@GetMapping("/getAllUser")
	public List<User>getAllUser()
	{
		return userService.getAllUser();
	}
	
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<Map<String,Object>>deleteUser(@PathVariable("id")int id)throws UserNotFoundException
	{
		Map<String,Object> response=userService.deleteUser(id);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User user)
	{
		User u=userService.updateUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).header("add","User added").body(user);

	}*/

}
