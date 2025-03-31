package com.doctorfinder.services;

import com.doctorfinder.entities.Doctor;

public interface DoctorServ {
	
	public Doctor signUp(Doctor doctor);

	public Doctor doctorLogin(Doctor doctor);

	public Doctor loggedInDoctor(int id);

	public Doctor getDoctorById(int docId);

}
