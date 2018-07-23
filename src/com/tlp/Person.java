package com.tlp;

public class Person {

	private String name;
	private Integer age;
	private String email;
	private String contact;
	private String panCard;
	
	
	
	public Person(String name, Integer age, String email, String contact, String panCard) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.contact = contact;
		this.panCard = panCard;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getPanCard() {
		return panCard;
	}



	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	
	
}
