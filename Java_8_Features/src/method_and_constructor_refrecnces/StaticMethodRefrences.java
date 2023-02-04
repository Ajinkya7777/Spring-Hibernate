package method_and_constructor_refrecnces;

interface Test {

	public void m1();
}

public class StaticMethodRefrences {

	public static void m2() {
		System.out.println("This is static method demo");
	}

	public static void main(String[] args) {

		Test t = StaticMethodRefrences::m2;

		t.m1(); // here Test t refrence will hold the method refrence of m2 and internall jvm
				// will execute the m2 method
				// in place of m1 abstract method present in Test functional interface.

	}
}
