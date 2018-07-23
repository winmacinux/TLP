package com.tlp;

public class CoverageStability implements Insurance {

	private Person customer;	
	private String coverage;
	private String industry;
	private String status;
	
	
	
	public CoverageStability(Person customer, String coverage, String industry) {
		super();
		this.customer = customer;
		this.coverage = coverage;
		this.industry = industry;
	}
	
	

	public Person getCustomer() {
		return customer;
	}



	public void setCustomer(Person customer) {
		this.customer = customer;
	}



	public String getCoverage() {
		return coverage;
	}



	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}



	public String getIndustry() {
		return industry;
	}



	public void setIndustry(String industry) {
		this.industry = industry;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public void setRating() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getRating() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getPersonDetails() {
		return customer;
	}

}
