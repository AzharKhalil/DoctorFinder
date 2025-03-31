package com.doctorfinder.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

	@Id
	@Column(updatable = false, name = "appt_id")
	@GeneratedValue(generator = "APPT_ID_SEQ", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "APPT_ID_SEQ", sequenceName = "APPT_ID_SEQ", allocationSize = 1)
	private int id;
	@Column(name = "start_time")
	private LocalDateTime start;
	@Column(name = "end_time")
	private LocalDateTime end;
	@ManyToOne
	@JoinColumn(name = "doc_id")
	private Doctor docId;
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patientId;
	@Column(name = "doc_notes")
	private String docNotes;
	@Column(name = "appt_reason")
	private String text;
	
	public Appointment() {
		super();
	}

	public Appointment(LocalDateTime start, LocalDateTime end, Doctor docId, Patient patientId, String docNotes, String text) {
		super();
		this.start = start;
		this.end = end;
		this.docId = docId;
		this.patientId = patientId;
		this.docNotes = docNotes;
		this.text = text;
	}

	public Appointment(int id, LocalDateTime start, LocalDateTime end, Doctor docId, Patient patientId, String docNotes, String text) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
		this.docId = docId;
		this.patientId = patientId;
		this.docNotes = docNotes;
		this.text = text;
	}

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

	public Doctor getDocId() {
		return docId;
	}

	public void setDocId(Doctor docId) {
		this.docId = docId;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	public String getDocNotes() {
		return docNotes;
	}

	public void setDocNotes(String docNotes) {
		this.docNotes = docNotes;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", start=" + start + ", end=" + end + ", docId=" + docId
				+ ", patientId=" + patientId + ", docNotes=" + docNotes + "]";
	}
	
	
}
