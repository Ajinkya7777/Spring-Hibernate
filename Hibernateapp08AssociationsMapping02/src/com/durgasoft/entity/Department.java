package com.durgasoft.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	@Id
	@Column(name = "deptNo" ,length = 10)
	private int deptNo;
	@Column(name = "deptName",length = 10)
	private String deptName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> emps;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptNo, String deptName, List<Employee> emps) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.emps = emps;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

}
