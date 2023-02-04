package method_and_constructor_refrecnces;

interface Test3 {
	public Sample m1(String s);
}

class Sample {
	String s;

	public Sample(String s) {

		this.s = s;
		System.out.println("Constructor Executed:" + s);
	}
}

public class ConstructorReference {

	public static void main(String[] args) {

		Test3 t = s -> new Sample(s);
		t.m1("Using Lambda Refrence");

		Test3 t2 = Sample::new;
		t2.m1("Using Constructor Refernce");

	}
}
