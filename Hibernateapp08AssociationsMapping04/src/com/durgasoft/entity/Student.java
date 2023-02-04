package com.durgasoft.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@Column(name = "sId", length = 10)
	private int sid;
	@Column(name = "sname", length = 10)
	private String sname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "stdudent_courses", joinColumns = { @JoinColumn(name = "sId") }, inverseJoinColumns = {
			@JoinColumn(name = "courseId") })
	private List<Courses> courses;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

}
