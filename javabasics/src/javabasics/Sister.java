package javabasics;

public class Sister implements Person {

	private Person person;
public Sister() {
	// TODO Auto-generated constructor stub
}
	public Sister(Person person) {
		this.person = person;
	}

	@Override
	public void relationships() {

		System.out.println(" This is Sister");
	}

}
