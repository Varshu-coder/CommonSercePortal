package com.service;

import org.springframework.stereotype.Service;

import com.model.Scheme;
@Service
public interface SchemeService {
	
	public Scheme saveScheme(Scheme s);
	
	/*public Scheme getOneScheme(int id);
	
	public List<Scheme>getAllscheme();
	
	public Map<String,Object>deleteScheme(int id)throws SchemeNotFoundException;
	
	public Scheme updateScheme(Scheme scheme);*/

}
