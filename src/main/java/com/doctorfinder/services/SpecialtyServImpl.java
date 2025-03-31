package com.doctorfinder.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorfinder.entities.Specialty;
import com.doctorfinder.repositories.SpecialtyRepo;

@Service
public class SpecialtyServImpl implements SpecialtyServ {

	@Autowired
	private SpecialtyRepo sr;

	@Override
	public Specialty getSpecialtyBySpecialtyId(int id) {
		return sr.findById(id).get();
	}
}
