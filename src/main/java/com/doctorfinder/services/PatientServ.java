package com.doctorfinder.services;

import com.doctorfinder.entities.Patient;

public interface PatientServ {
	
	Patient patientLogin(Patient patient);
	
	public Patient loggedInPatient(int id);

	boolean addPatient(Patient p);
	
	public Patient getPatientById(int id);
	
}
