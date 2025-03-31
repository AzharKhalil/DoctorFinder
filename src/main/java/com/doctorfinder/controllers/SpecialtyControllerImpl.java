package com.doctorfinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.doctorfinder.services.SpecialtyServ;

@RestController
public class SpecialtyControllerImpl implements SpecialtyController {

	@Autowired
	private SpecialtyServ ss;
	
}
