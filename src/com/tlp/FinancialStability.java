package com.tlp;

public class FinancialStability implements Insurance {
	
	private Person customer;	
	private Integer yearsInBusiness;
	private Integer bankRuptcs;
	private Integer yearAtCurrentAddress;
	private String status;

	
	
	public FinancialStability(Person customer, Integer yearsInBusiness, Integer bankRuptcs,
			Integer yearAtCurrentAddress) {
		super();
		this.customer = customer;
		this.yearsInBusiness = yearsInBusiness;
		this.bankRuptcs = bankRuptcs;
		this.yearAtCurrentAddress = yearAtCurrentAddress;
	}

	public Person getCustomer() {
		return customer;
	}

	public void setCustomer(Person customer) {
		this.customer = customer;
	}

	public Integer getYearsInBusiness() {
		return yearsInBusiness;
	}

	public void setYearsInBusiness(Integer yearsInBusiness) {
		this.yearsInBusiness = yearsInBusiness;
	}

	public Integer getBankRuptcs() {
		return bankRuptcs;
	}

	public void setBankRuptcs(Integer bankRuptcs) {
		this.bankRuptcs = bankRuptcs;
	}

	public Integer getYearAtCurrentAddress() {
		return yearAtCurrentAddress;
	}

	public void setYearAtCurrentAddress(Integer yearAtCurrentAddress) {
		this.yearAtCurrentAddress = yearAtCurrentAddress;
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
		return getStatus();
	}

	@Override
	public Person getPersonDetails() {
		return customer;	

	}

}
