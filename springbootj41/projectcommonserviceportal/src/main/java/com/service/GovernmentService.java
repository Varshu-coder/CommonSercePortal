package com.service;

import java.util.List;
import java.util.Map;
import com.exception.GovernmentNotFoundException;
import com.model.Government;

public interface GovernmentService {
	
    public Government saveGovernment(Government g);
	
	public Government getOneGovernment(int id);
	
	public List<Government>getAllGovernment();
	
	public Map<String,Object>deleteGovernment(int id)throws GovernmentNotFoundException;
	
	public Government updateGovernment(Government g);


}
