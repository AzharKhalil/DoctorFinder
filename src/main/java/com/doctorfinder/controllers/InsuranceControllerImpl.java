package com.doctorfinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.doctorfinder.services.InsuranceServ;

@RestController
public class InsuranceControllerImpl implements InsuranceController {

	@Autowired
	private InsuranceServ is;
	
}
