package com.doctorfinder.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doctorfinder.entities.Appointment;
import com.doctorfinder.entities.Doctor;
import com.doctorfinder.entities.Patient;

@Repository
public interface AppointmentRepo extends CrudRepository<Appointment, Integer>{

	List<Appointment> findAllByDocId(Doctor doc);
	List<Appointment> findAllByPatientId(Patient patient);
	
	
}
