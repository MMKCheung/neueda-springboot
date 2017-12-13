package uk.ac.belfastmet.RHI.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Beneficiary {

	@Id
	@GeneratedValue
	private Integer beneficiaryId;


	@NotEmpty
	private String name;
	
	private String date;
	private String location;
	private String techtype;
	private Integer capacity;
	private Float payment;
	
	public Beneficiary(Integer beneficiaryId, String name, String date, String location, String techtype, Integer capacity,
			Float payment) {
		super();
		this.beneficiaryId = beneficiaryId;
		this.name = name;
		this.date = date;
		this.location = location;
		this.techtype = techtype;
		this.capacity = capacity;
		this.payment = payment;
	}
	
	public Beneficiary() {
		// TODO Auto-generated constructor stub
	}

	public Integer getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(Integer beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTechtype() {
		return techtype;
	}

	public void setTechtype(String techtype) {
		this.techtype = techtype;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Float getPayment() {
		return payment;
	}

	public void setPayment(Float payment) {
		this.payment = payment;
	}
	
}

