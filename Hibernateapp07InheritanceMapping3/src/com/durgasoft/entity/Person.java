package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
	@Id
	@Column(name = "pname")
	private String pname;
	@Column(name = "address")
	private String paddr;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String pname, String paddr) {
		super();
		this.pname = pname;
		this.paddr = paddr;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	
	
}
