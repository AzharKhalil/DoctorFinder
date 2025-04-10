package com.doctorfinder.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doctorfinder.entities.Patient;

@Repository
public interface PatientRepo extends CrudRepository<Patient, Integer>{
	
	public Patient getPatientByEmail(String email);
	
	public List<Patient> getPatientByFirstNameAndLastName(String firstName, String LastName);
	
	
}
