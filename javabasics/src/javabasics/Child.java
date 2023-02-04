package javabasics;

public class Child implements Person {
	
	private Person person;
	public Child() {
		// TODO Auto-generated constructor stub
	}
	public Child(Person person) {
	this.person=person;
	}
	@Override
	public void relationships() {
		
		System.out.println(" This is child");
	}

}
