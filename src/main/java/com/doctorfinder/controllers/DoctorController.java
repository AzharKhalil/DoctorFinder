package com.doctorfinder.controllers;



import com.doctorfinder.entities.Doctor;

public interface DoctorController {

	public Doctor signUp(Doctor doctor);

	public Doctor doctorLogin(Doctor doctor);
	
	public Doctor loggedInDoctor(String id);
	
}
