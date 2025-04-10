package com.doctorfinder.entities;



import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@JsonSerialize
@Entity
@Table(name="doctors")
public class Doctor {

	
	//----------------------------------------
	//Fields

	// Primary Key Column
	@Id
	@Column(updatable = false, name = "doctor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId;

	// Unique key Column
	@Column(unique = true, name = "email")
	private String email;

	// Normal Columns
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "password")
	private String password;
	@Column(name = "years_in_practice")
	private int yearsInPractice;
	@Column(name = "description")
	private String description;
	@Column(name = "med_school")
	private String medSchool;

	// Foreign Key Columns
	@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "practice_id")
	private Practice practiceId;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "specialty_id")
	private Specialty specialtyId;

	

//------------------------------------------------------------------
	// Constructors

	public Doctor() {
		super();
	}
	
	
	public Doctor(int docId, String email, String firstName, String lastName, String password, int yearsInPractice,
			String description, String medSchool, Specialty SpecialtyId, Practice practiceId) {
		super();
		this.docId = docId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.yearsInPractice = yearsInPractice;
		this.description = description;
		this.medSchool = medSchool;
		this.specialtyId = SpecialtyId;
		this.practiceId = practiceId;
	}


	public Doctor(String email, String firstName, String lastName, String password, int yearsInPractice,
			String description, String medSchool, Specialty SpecialtyId, Practice practiceId) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.yearsInPractice = yearsInPractice;
		this.description = description;
		this.medSchool = medSchool;
		this.specialtyId = SpecialtyId;
		this.practiceId = practiceId;
	}


	

//--------------------------------------------------------------------------------
	// Getters And Setters
	
	public int getDocId() {
		return docId;
	}


	public void setDocId(int docId) {
		this.docId = docId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getYearsInPractice() {
		return yearsInPractice;
	}


	public void setYearsInPractice(int yearsInPractice) {
		this.yearsInPractice = yearsInPractice;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getMedSchool() {
		return medSchool;
	}


	public void setMedSchool(String medSchool) {
		this.medSchool = medSchool;
	}


	public Specialty getSpecialtyId() {
		return specialtyId;
	}


	public void setSpecialtyId(Specialty specialtyId) {
		this.specialtyId = specialtyId;
	}


	public Practice getPracticeId() {
		return practiceId;
	}


	public void setPracticeId(Practice practiceId) {
		this.practiceId = practiceId;
	}

	
//---------------------------------------------------------------------
	//ToString Method
	
	
	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", yearsInPractice=" + yearsInPractice + ", description=" + description
				+ ", yearGraduated=" + medSchool + ", specialtyId=" + specialtyId + ", practiceId=" + practiceId
				+ ", insuranceId=" + "]";
	}
	
	
	

}
