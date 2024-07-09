package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserRepository;
import com.exception.UserNotFoundException;
import com.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;
	
	public User saveUser(User u) {
		
		return userRepo.save(u);
	}
	/*
	@Override
	public User getOneUser(int id) {
		return userRepo.findById(id).orElse(null);
	}*/
	/*
	@Override
	public Map<String, Object> deleteUser(int id) throws UserNotFoundException 
		{
			Map<String, Object> response=new HashMap<String,Object>();
			try {
			User user=userRepo.findById(id).orElseThrow(()->new UserNotFoundException("user not exist"));
			userRepo.delete(user);
			response.put("deleted", Boolean.TRUE);
			}
			catch(UserNotFoundException u)
			{
				response.put("not deleted", u.getMessage());	
			}
		
		return response;
	}
	@Override
	public User updateUser(User user) {
		
		User u=userRepo.findById(user.getUserId()).orElse(null);
		
		u.setUserName(user.getUserName());
		u.setUserEmail(user.getUserEmail());
		u.setScheme(user.getScheme());
		
		return userRepo.save(u);
	}
	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}*/

}
