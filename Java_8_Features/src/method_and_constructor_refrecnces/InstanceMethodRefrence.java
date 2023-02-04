package method_and_constructor_refrecnces;

interface Test2 {
	public void printDigit(int i);
}

public class InstanceMethodRefrence {

	public void printingDigit(int i) {
		System.out.println("The digit is :" + i);
	}

	public static void main(String[] args) {
		InstanceMethodRefrence i = new InstanceMethodRefrence();

		Test2 t = i::printingDigit;

		t.printDigit(20);

	}
}
