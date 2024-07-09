package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ApplicationRepository;
import com.exception.ApplicationNotFoundException;
import com.model.Application;
import com.model.Government;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	@Autowired
	ApplicationRepository appliRepo;

	@Override
	public Application saveAppli(Application a) {
		// TODO Auto-generated method stub
		return appliRepo.save(a);
	}

	@Override
	public Application getOneAppli(int id) {
		// TODO Auto-generated method stub
		return appliRepo.findById(id).orElse(null);
	}

	@Override
	public List<Application> getAllappli() {
		// TODO Auto-generated method stub
		return appliRepo.findAll();
	}

	@Override
	public Map<String, Object> deleteAppli(int id) throws ApplicationNotFoundException {
		Map<String,Object> response=new HashMap<String,Object>();
		try {
			Application appli=appliRepo.findById(id).orElseThrow(()->new ApplicationNotFoundException("Application not exist"));
		appliRepo.delete(appli);
		response.put("deleted", Boolean.TRUE);
		}
		catch(ApplicationNotFoundException u)
		{
			response.put("not deleted", u.getMessage());	
		}
		return response;
	}

	@Override
	public Application updateAppli(Application appli) {
		
       Application a=appliRepo.findById(appli.getAppliId()).orElse(null);
		
		a.setName(appli.getName());;
		
		return appliRepo.save(a);
	}

}
