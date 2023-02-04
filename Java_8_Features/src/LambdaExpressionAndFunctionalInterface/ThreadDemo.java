package LambdaExpressionAndFunctionalInterface;

class ThreadDemo {
	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Lambda: Child Thread");

			}

		};

//		Thread t = new Thread(r);
//		t.start();
		
		new Thread(r).start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Lambda: Main Thread");
		}

	}
}
