package com.doctorfinder.services;

import java.time.LocalDateTime;
import java.util.List;

import com.doctorfinder.entities.Availability;
import com.doctorfinder.entities.Doctor;
import com.doctorfinder.entities.Specialty;

public interface AvailabilityServ {

	public Availability getAvailabiltyById(int id);
	
	public List<Availability> getAvailabilityForCalendar(Doctor docId, LocalDateTime start, LocalDateTime end);

	public List<Availability> getAvailabilityBySpecialty(Specialty spec, LocalDateTime start, LocalDateTime end);

	public boolean cancelAvailibity(String id);
	
	public Availability addAvailability(Availability a);

}
