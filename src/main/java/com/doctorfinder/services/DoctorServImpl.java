package com.doctorfinder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorfinder.entities.Doctor;
import com.doctorfinder.entities.Practice;
import com.doctorfinder.entities.Specialty;
import com.doctorfinder.repositories.DoctorRepo;
import com.doctorfinder.repositories.PracticeRepo;
import com.doctorfinder.repositories.SpecialtyRepo;

@Service
public class DoctorServImpl implements DoctorServ {
	


	@Autowired
	private DoctorRepo dr;
	
	@Autowired
	private SpecialtyRepo sr;
	
	@Autowired
	private PracticeRepo pr;

	@Override
	public Doctor signUp(Doctor doctor) {
		int id = doctor.getSpecialtyId().getSpecialtyId();
		System.out.println(id);
		Specialty spec = sr.findById(id).get();
		doctor.setSpecialtyId(spec);
		int pracId = doctor.getPracticeId().getPracticeId(); 
		Practice prac = pr.findById(pracId).get();
		doctor.setPracticeId(prac);
		System.out.println(doctor);
		
		 return dr.save(doctor);
	}

	@Override
	public Doctor doctorLogin(Doctor doctor) {
		Doctor foundDoc = dr.getDoctorByEmail(doctor.getEmail());
		if (foundDoc != null && foundDoc.getPassword().equals(doctor.getPassword())) {
			System.out.println(foundDoc);
			
			return foundDoc;
		}
		return null;
	}

	@Override
	public Doctor loggedInDoctor(int id) {
		return dr.findById(id).get();
	}

	@Override
	public Doctor getDoctorById(int docId) {
		return dr.findById(docId).get();
	}

	
}
