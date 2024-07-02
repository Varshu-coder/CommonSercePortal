package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeRepository;
import com.exception.UserNotFoundException;
import com.model.Employee;


@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	public Employee saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		return empRepo.save(e);
	}
	@Override
	public Employee getOneEmployee(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).orElse(null);
	}
	
	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
	/*@Override
	public void deleteEmployee(int id) {
	
		empRepo.deleteById(id);
		
	}*/
	@Override
	public Map<String, Object> deleteEmployee(int id) throws UserNotFoundException {
		Map<String,Object> response=new HashMap<String,Object>();
		try {
		Employee emp=empRepo.findById(id).orElseThrow(()->new UserNotFoundException("user not exist"+id));
		empRepo.delete(emp);
		response.put("deleted", Boolean.TRUE);
		}catch(UserNotFoundException u)
		{
			response.put("not deleted", u.getMessage());
		}
		return response;
	}
	
	
	public Employee updateEmp(Employee employee) {
		Employee e=empRepo.findById(employee.getId()).orElse(employee);
		
		e.setName(employee.getName());
		e.setSalary(employee.getSalary());
		return empRepo.save(e);
	}
	
	
	}


