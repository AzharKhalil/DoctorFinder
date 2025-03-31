package com.doctorfinder.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doctorfinder.entities.Doctor;
import com.doctorfinder.services.DoctorServ;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/doctors")
public class DoctorControllerImpl implements DoctorController {

	@Autowired
	private DoctorServ ds;

	@Override
	@CrossOrigin
	@PostMapping(value="/DoctorSignup", consumes="application/json", produces="application/json")
	public Doctor signUp(@RequestBody Doctor doctor) {
		return ds.signUp(doctor);
		
		//return ds.signUp(doctor);
		
	
	}
	

	@Override
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PostMapping(value = "/doctorLogin", consumes = "application/json", produces = "application/json")
	public Doctor doctorLogin(@RequestBody Doctor doctor) {
		System.out.println(doctor);
		Doctor foundDoc = ds.doctorLogin(doctor);
		
		return foundDoc;
	}

	
        @Override
	@CrossOrigin
	@GetMapping(value = "/loggedInDoctor", produces = "application/json")
	public Doctor loggedInDoctor(@RequestParam(required = true) String id) {
		System.out.println(id);
		int inputId;
		try {
			inputId = Integer.parseInt(id);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	    return ds.loggedInDoctor(inputId);
	}

		
}
