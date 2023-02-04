package LambdaExpressionAndFunctionalInterface;

public class AnonmyousThredDemo {

	public static void main(String[] args) {

		Runnable r = new Runnable() // new Runnable () // object of anonymous class
		{ // anonymous class
			public void run() {  // implemented the run method present in the Runnable interface

				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thred");
				}
			}

		};

		Thread t = new Thread(r);    //thread object created and then we passed the anonymous object reference to the constructor of thred
		t.start();           //instance of sub class allocate and then started in this case sub class is anonymous class
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
