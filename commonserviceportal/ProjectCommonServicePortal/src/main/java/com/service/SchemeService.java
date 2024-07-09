package com.service;

import java.util.List;
import java.util.Map;

import com.exception.SchemeNotFoundException;
import com.model.Scheme;

public interface SchemeService {
	
	public Scheme saveScheme(Scheme s);
	
	/*public Scheme getOneScheme(int id);
	
	public List<Scheme>getAllscheme();
	
	public Map<String,Object>deleteScheme(int id)throws SchemeNotFoundException;
	
	public Scheme updateScheme(Scheme scheme);*/

}
