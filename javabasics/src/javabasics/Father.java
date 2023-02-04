package javabasics;


public class Father implements Person {
		
	public Father() {
		// TODO Auto-generated constructor stub
	}
	private Person person;
	public Father(Person person) {
		this.person=person;
	}
	@Override
	public void relationships() {

		System.out.println(" This is father ");
	}

	
	
}
