package com.tlp;

public class PropertyRisk implements Insurance {

	private Person customer;	
	private String constructionType;
	private Integer priorLosses;
	private Integer propertyAge;
	private Integer propertyvalue;
	private String status;
	
	
	

	public PropertyRisk(Person customer, String constructionType, Integer priorLosses, Integer propertyAge,
			Integer propertyvalue) {
		super();
		this.customer = customer;
		this.constructionType = constructionType;
		this.priorLosses = priorLosses;
		this.propertyAge = propertyAge;
		this.propertyvalue = propertyvalue;
	}


	public Person getCustomer() {
		return customer;
	}


	public void setCustomer(Person customer) {
		this.customer = customer;
	}


	public String getConstructionType() {
		return constructionType;
	}


	public void setConstructionType(String constructionType) {
		this.constructionType = constructionType;
	}


	public Integer getPriorLosses() {
		return priorLosses;
	}


	public void setPriorLosses(Integer priorLosses) {
		this.priorLosses = priorLosses;
	}

	
	public Integer getPropertyAge() {
		return propertyAge;
	}


	public void setPropertyAge(Integer propertyAge) {
		this.propertyAge = propertyAge;
	}


	public Integer getPropertyvalue() {
		return propertyvalue;
	}


	public void setPropertyvalue(Integer propertyvalue) {
		this.propertyvalue = propertyvalue;
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
