package com.doctorfinder.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDateTime;



@Entity
@Table(name = "availability")
public class Availability {
	
	// INSTANCE VARIABLES //
	@Id
	@Column(updatable = false, name = "availability_id")
	@SequenceGenerator(sequenceName = "AVAILABILITY_ID_SEQ", name = "AVAILABILITY_ID_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "AVAILABILITY_ID_SEQ", strategy = GenerationType.SEQUENCE)
	private int id; // Primary Key
	
	@Column(name = "start_time", columnDefinition = "TIMESTAMP")
	private LocalDateTime start;
	@Column(name = "end_time", columnDefinition = "TIMESTAMP")
	private LocalDateTime end;
	@Column(name = "text")
	private String text;

	@Column(name = "color")
	private String backColor;
	
	//foreign keys
	@OneToOne
	@JoinColumn(name = "specialty_id")
	private Specialty specialtyId;
	
	
	@ManyToOne
	@JoinColumn(name = "doc_id")
	private Doctor doctorId;
	

	// CONSTRUCTORS //
	public Availability() {
		super();
	}

	
	public Availability(int id, LocalDateTime start, LocalDateTime end, Specialty specialtyId, Doctor doctorId, String text, String backColor) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.specialtyId = specialtyId;
		this.doctorId = doctorId;
		this.text = text;
		this.backColor = backColor;
	}


	// GETTERS AND SETTERS // 
	public int getid() {
		return id;
	}


	public void setid(int id) {
		this.id = id;
	}

	


	public LocalDateTime getStart() {
		return start;
	}


	public void setStart(LocalDateTime start) {
		this.start = start;
	}


	public LocalDateTime getEnd() {
		return end;
	}


	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getBackColor() {
		return backColor;
	}


	public void setBackColor(String backColor) {
		this.backColor = backColor;
	}



	public Specialty getSpecialtyId() {
		return specialtyId;
	}


	public void setSpecialtyId(Specialty specialtyId) {
		this.specialtyId = specialtyId;
	}


	public Doctor getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}


	@Override
	public String toString() {
		return "Availability [id=" + id + ", start=" + start + ", end=" + end + ", specialtyId=" + specialtyId
				+ ", doctorId=" + doctorId + "]";
	}





	
	
	
	
	
	
	
	
}
