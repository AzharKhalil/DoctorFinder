package com.doctorfinder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorfinder.repositories.InsuranceRepo;

@Service
public class InsuranceServImpl implements InsuranceServ {
	
	@Autowired
	private InsuranceRepo ir;
}
