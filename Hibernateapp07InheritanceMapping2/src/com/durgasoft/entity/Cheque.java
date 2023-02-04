package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cheque")
@PrimaryKeyJoinColumn(name = "tid")
public class Cheque extends Payment{
	
	@Id
	 @Column(name = "tid")
	private int tid;
	@Column(name = "cno")
	private String cNo;
	@Column(name = "accNo")
	private String accNo;
	
	public Cheque() {
		// TODO Auto-generated constructor stub
	}

	public Cheque(int tid, String cNo, String accNo) {
		super();
		this.tid = tid;
		this.cNo = cNo;
		this.accNo = accNo;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	
}
