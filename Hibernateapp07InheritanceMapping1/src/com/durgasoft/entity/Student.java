package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "emp6")
@DiscriminatorValue("std")
public class Student extends Account {

	@Column(name = "sName")
	private String name;
	@Column(name = "smarks")
	private int marks;
	@Column(name = "sAddrs")
	private String sAddres;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int marks, String sAddres) {
		super();
		this.name = name;
		this.marks = marks;
		this.sAddres = sAddres;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getAddrs() {
		return sAddres;
	}

	public void setAddrs(String sAddrs) {
		this.sAddres = sAddrs;
	}

}
