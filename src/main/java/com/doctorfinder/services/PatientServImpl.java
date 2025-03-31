package com.doctorfinder.services;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorfinder.entities.Patient;
import com.doctorfinder.repositories.PatientRepo;

@Service
public class PatientServImpl implements PatientServ {
	
	@Autowired
	private PatientRepo patRepo;

	@Override
	public Patient patientLogin(Patient patient) {
		Patient foundPatient = patRepo.getPatientByEmail(patient.getEmail());
		if(foundPatient != null && foundPatient.getPassword().equals(patient.getPassword())) {
			return foundPatient;
		}
		return null;
	}

	@Override
	public Patient loggedInPatient(int id) {
		try {
			System.out.println(id);
			Patient p = patRepo.findById(id).get();
			return p;
		} catch (NoSuchElementException e) {
			return null;
		}
	}
	
	@Override
	public boolean addPatient(Patient p) {
		
		if (patRepo.getPatientByEmail(p.getEmail()) == null) {
			patRepo.save(p);
			return true;
		}
		return false;
	}

	@Override
	public Patient getPatientById(int id) {
		return patRepo.findById(id).get();
	}
}
	
