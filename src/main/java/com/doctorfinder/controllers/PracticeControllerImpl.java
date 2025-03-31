package com.doctorfinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.doctorfinder.services.PracticeServ;

@RestController
public class PracticeControllerImpl implements PracticeController {

	@Autowired
	private PracticeServ practServ;
}
