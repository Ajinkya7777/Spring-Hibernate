package com.nt.relationships;

public class GrandFather implements Relationships {

	private Relationships relationships;
	private Father father;
	
	
	public GrandFather() {
		System.out.println("GrandFather.GrandFather()");
	}
	public GrandFather(Father father) {
		this.father = father;
	}
	public void setFather(Father father) {
		this.father = father;
	}
	public Father getFather() {
		return father;
	}



	public void makeRelationships() {
		System.out.println("GrandFather");
			
	}

}
