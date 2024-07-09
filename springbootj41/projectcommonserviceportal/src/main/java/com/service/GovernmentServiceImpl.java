package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.GovernmentRepository;
import com.exception.GovernmentNotFoundException;
import com.model.Government;

@Service
public class GovernmentServiceImpl implements GovernmentService{
	
	@Autowired
	GovernmentRepository govRepo;

	@Override
	public Government saveGovernment(Government g) {
		return govRepo.save(g);
	}

	@Override
	public Government getOneGovernment(int id) {
		return govRepo.findById(id).orElse(null);
	}

	@Override
	public List<Government> getAllGovernment() {
		return govRepo.findAll();
	}

	@Override
	public Map<String, Object> deleteGovernment(int id) throws GovernmentNotFoundException 
		{
			Map<String, Object> response=new HashMap<String,Object>();
			try {
				Government gov=govRepo.findById(id).orElseThrow(()->new GovernmentNotFoundException("Government not exist"));
			govRepo.delete(gov);
			response.put("deleted", Boolean.TRUE);
			}
			catch(GovernmentNotFoundException u)
			{
				response.put("not deleted", u.getMessage());	
			}
		return null;
	}

	@Override
	public Government updateGovernment(Government gov) {
		Government g=govRepo.findById(gov.getGovId()).orElse(null);
		
		g.setGovName(gov.getGovName());;
		
		return govRepo.save(g);
	}
	
}


