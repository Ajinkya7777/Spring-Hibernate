package javabasics;

public class MainPerson {
	
	public static void main(String[] args) {
		Person person1 = PersonFactory.createObject("child");
		//Person person2= PersonFactory.createFather();
		//Person person3= PersonFactory.createSister();
		
		person1.relationships();
		//person2.relationships();
		//person3.relationships();
		
		
		
	}
}
