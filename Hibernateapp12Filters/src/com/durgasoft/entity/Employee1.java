package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;

@Entity
@Table(name = "FilterEmp")
@FilterDef(name = "empType", parameters = {@ParamDef(name = "salary", type = "integer")})
@Filters({ @Filter(name = "empType", condition = ":salary>:salary") })
public class Employee1 {

	@Id
	@Column(name = "eid")
	private int eno;
	@Column(name = "ename")
	private String ename;
	@Column(name = "esal")
	private int salary;
	@Column(name = "etype")
	private String etype;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getetype() {
		return etype;
	}

	public void seteType(String type) {
		this.etype = type;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", etype=" + etype + "]";
	}

}
