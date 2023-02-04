package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {

	@Id
	@Column(name = "courseId", length = 10)
	private int cid;
	@Column(name = "courseName", length = 10)
	private String cname;
	@Column(name = "courseCost", length = 10)
	private int cost;

	public int getcid() {
		return cid;
	}
	
	public Courses() {
		// TODO Auto-generated constructor stub
	}

	public Courses(int cid, String cname, int cost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}

	public void setcid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", cname=" + cname + ", cost=" + cost + "]";
	}

}
