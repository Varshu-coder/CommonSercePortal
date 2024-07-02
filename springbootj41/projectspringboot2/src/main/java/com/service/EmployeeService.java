package com.service;

import java.util.List;
import java.util.Map;

import com.exception.UserNotFoundException;
import com.model.Employee;


public interface EmployeeService {
	public Employee saveEmployee(Employee e);
	
	public Employee getOneEmployee(int id);
	
	//public void deleteEmployee(int id);
	
	public Map<String,Object> deleteEmployee(int id) throws UserNotFoundException;
	
	public Employee updateEmp(Employee employee);
	
	public List<Employee> getAllEmp();

}
