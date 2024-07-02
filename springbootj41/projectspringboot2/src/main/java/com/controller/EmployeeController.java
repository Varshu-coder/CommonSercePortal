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

import com.exception.UserNotFoundException;
import com.model.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	/*
	@PostMapping("/add")
	public Employee saveEmployee(@RequestBody Employee e) {
		
		return employeeService.saveEmployee(e);

     }
	
	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee u)
	{
		Employee employee=employeeService.saveEmployee(u);
		return ResponseEntity.status(HttpStatus.CREATED).header("add","Employee added").body(employee);
		
	}
	@GetMapping("/getOne/{id}")
	public Employee getOneEmployeee(@PathVariable("id")int id) {
		return employeeService.getOneEmployee(id);
	}*/
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmp(){
		return employeeService.getAllEmp();
		
	}
	/*
	@DeleteMapping("/deleteOne/{id}")
	public void deleteEmployee(@PathVariable("id")int id)
	{
		employeeService.deleteEmployee(id);
	}*/
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<Map<String,Object>> deleteUser(@PathVariable("id")int id) throws UserNotFoundException
	{
		Map<String,Object> response =employeeService.deleteEmployee(id);
	return ResponseEntity.ok(response);
	}
	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
	{
		Employee e=employeeService.updateEmp(employee);
	return ResponseEntity.status(HttpStatus.ACCEPTED).header("update", "employee updated").body(e);
	}
 }

