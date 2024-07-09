package com.service;

import java.util.List;
import java.util.Map;

import com.exception.ApplicationNotFoundException;
import com.model.Application;

public interface ApplicationService {
	
public Application saveAppli(Application a);
	
    public Application getOneAppli(int id);
	
	public List<Application>getAllappli();
	
	public Map<String,Object>deleteAppli(int id)throws ApplicationNotFoundException;
	
	public Application updateAppli(Application appli);

}
