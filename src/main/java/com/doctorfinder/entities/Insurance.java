package com.doctorfinder.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name="insurances")
public class Insurance {
	
	//---------------------------------------------------
	//Fields
	
	@Id
	@Column(updatable=false, name="insurance_id")
	@SequenceGenerator(sequenceName = "", name = "INSURANCE_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "INSURANCE_SEQ", strategy = GenerationType.SEQUENCE)
	private int insuranceId;
	@Column(name = "insurance_name")
	private String insurance;
	
	//----------------------------------
	//Constructors
	public Insurance() {
		super();
	}

	public Insurance(int insuranceId, String insurance) {
		super();
		this.insuranceId = insuranceId;
		this.insurance = insurance;
	}

	public Insurance(String insurance) {
		super();
		this.insurance = insurance;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	//----------------------------------------------------------------
	//ToString Method

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insurance=" + insurance + "]";
	}
	
	
	
	

}
