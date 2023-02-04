package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable //HAS - A property in a database
public class Address {

	@Column(name = "addrsStr") //column name in database
	private String street;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street) {
		super();
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
