package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "card")
@PrimaryKeyJoinColumn(name = "tid")
public class Card extends Payment {
	@Id
	@Column(name = "tid")
	private int tid;
	@Column(name = "cardno")
	private int cardNo;
	@Column(name = "cexp")
	private String cardExp;

	public Card() {
		// TODO Auto-generated constructor stub
	}

	public Card(int tid, int cardNo, String cardExp) {
		super();
		this.tid = tid;
		this.cardNo = cardNo;
		this.cardExp = cardExp;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardExp() {
		return cardExp;
	}

	public void setCardExp(String cardExp) {
		this.cardExp = cardExp;
	}

}
