package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SchemeRepository;
import com.exception.SchemeNotFoundException;
import com.model.Scheme;

@Service
public class SchemeServiceImpl implements SchemeService {
	
	@Autowired
	SchemeRepository schemeRepo;

	@Override
	public Scheme saveScheme(Scheme s) {
		return schemeRepo.save(s);
	}
/*
	@Override
	public Scheme getOneScheme(int id) {
		return schemeRepo.findById(id).orElse(null);
	}

	@Override
	public List<Scheme> getAllscheme() {
		return schemeRepo.findAll();
	}

	@Override
	public Map<String, Object> deleteScheme(int id) throws SchemeNotFoundException 
		{
			Map<String, Object> response=new HashMap<String,Object>();
			try {
			Scheme scheme=schemeRepo.findById(id).orElseThrow(()->new SchemeNotFoundException("Scheme not exist"));
			schemeRepo.delete(scheme);
			response.put("deleted", Boolean.TRUE);
			}
			catch(SchemeNotFoundException u)
			{
				response.put("not deleted", u.getMessage());	
			}
		return null;
	}

	@Override
	public Scheme updateScheme(Scheme scheme) {
    Scheme s=schemeRepo.findById(scheme.getSchemeId()).orElse(null);
		
		s.setSchemeName(scheme.getSchemeName());
		s.setAmount(scheme.getAmount());
		s.setCriteria(scheme.getCriteria());
		
		return schemeRepo.save(s);
	}*/
	
}
	