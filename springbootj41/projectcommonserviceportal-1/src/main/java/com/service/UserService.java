package com.service;


import org.springframework.stereotype.Service;

import com.model.User;
@Service
public interface UserService {
	
public User saveUser(User u);
	
	//public User getOneUser(int id);
	
	//public void deleteUser(int id);
	
	//public Map<String,Object>deleteUser(int id)throws UserNotFoundException;
	
	//public User updateUser(User user);

	//public List<User> getAllUser();

}
