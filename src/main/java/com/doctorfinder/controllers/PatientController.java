package com.doctorfinder.controllers;


import org.springframework.web.bind.annotation.RequestBody;

import com.doctorfinder.entities.Patient;

public interface PatientController {
	
	public Patient patientLogin(Patient patient);
	
	public Patient loggedInPatient(String input);

	public boolean addPatient(@RequestBody Patient p);

}
