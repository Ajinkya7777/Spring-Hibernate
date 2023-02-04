package javabasics;

public class PersonFactory {

	public static Person createObject(String name) {
		if (name.equalsIgnoreCase("child")) {
			return new Child();
		} else if (name.equalsIgnoreCase("Sister")) {
			return new Sister();
		} else if (name.equalsIgnoreCase("Father")) {
			return new Father();

		} else {
			return null;
		}

	}
}
