package com.doctorfinder.services;

import java.util.List;

import com.doctorfinder.entities.Appointment;
import com.doctorfinder.entities.Doctor;
import com.doctorfinder.entities.Patient;

public interface AppointmentServ {

	public List<Appointment> getAllAppointmentsByDocId(Doctor doc);
	
	public List<Appointment> getAllAppointmentsByPatientId(Patient patient);
	
	public Appointment bookAppointment(Appointment appt);
	
	public boolean deleteAppointment(int id);

	
}
