package com.nt.relationships;

public class Brother implements Relationships {

	private Relationships relationships;
	
	public Brother() {
		System.out.println("Brother.Brother()");
	}
	public void makeRelationships() {
		
		System.out.println("Brother");
	}

}
