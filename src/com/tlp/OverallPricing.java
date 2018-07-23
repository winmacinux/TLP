package com.tlp;

public class OverallPricing implements Insurance {

	private Person person;
	private  String CustomerFinancialStability;
	private String CoverageLiability;
	private String Propertyrisk;
	private String status;


	public OverallPricing(Person person, String customerFinancialStability, String coverageLiability, String propertyrisk) {

		this.person =  person;
		this.CustomerFinancialStability = customerFinancialStability;
		this.CoverageLiability = coverageLiability;
		this.Propertyrisk = propertyrisk;
	}
	

	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public String getCustomerFinancialStability() {
		return CustomerFinancialStability;
	}
	public void setCustomerFinancialStability(String customerFinancialStability) {
		CustomerFinancialStability = customerFinancialStability;
	}
	public String getCoverageLiability() {
		return CoverageLiability;
	}
	public void setCoverageLiability(String coverageLiability) {
		CoverageLiability = coverageLiability;
	}
	public String getPropertyrisk() {
		return Propertyrisk;
	}
	public void setPropertyrisk(String propertyrisk) {
		Propertyrisk = propertyrisk;
	}


	@Override
	public void setRating() {
		// TODO Auto-generated method stub

	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String getRating() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Person getPersonDetails() {
		// TODO Auto-generated method stub
		return null;
	}









}
