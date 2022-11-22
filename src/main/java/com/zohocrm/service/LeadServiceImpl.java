package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Lead;
import com.zohocrm.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {


	@Autowired
	private LeadRepository leadrepo;
	
	
	@Override
	public void saveOneLead(Lead lead) {
		leadrepo.save(lead);
	}

}
