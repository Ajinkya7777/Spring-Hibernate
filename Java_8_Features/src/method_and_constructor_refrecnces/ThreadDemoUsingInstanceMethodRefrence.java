package method_and_constructor_refrecnces;

public class ThreadDemoUsingInstanceMethodRefrence {

	public void threadDemo() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		ThreadDemoUsingInstanceMethodRefrence t = new ThreadDemoUsingInstanceMethodRefrence();

		Runnable r = t::threadDemo;

		Thread tr = new Thread(r);
		tr.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
