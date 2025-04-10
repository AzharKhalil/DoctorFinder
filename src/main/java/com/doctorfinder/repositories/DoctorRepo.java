package com.doctorfinder.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.doctorfinder.entities.Doctor;
import com.doctorfinder.entities.Specialty;

@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Integer>{
	
	public Doctor getDoctorByEmail(String email);
	
	public List<Doctor> getDoctorsByFirstNameAndLastName(String firstName, String lastName);
	
	public List<Doctor> getDoctorsBySpecialtyId(Specialty specialty);
	
}
