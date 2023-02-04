package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable  //HAS - A property in a database
public class Account {
	@Column(name = "accNo") //column name in database
	int accNO;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNO) {
		super();
		this.accNO = accNO;
	}

	public int getAccNO() {
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

}
