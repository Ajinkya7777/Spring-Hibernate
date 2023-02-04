package LambdaExpressionAndFunctionalInterface;

class ThreadDemo1 {

	public static void main(String[] args) {

		Test4 d = new Test4();

		Thread t = new Thread(d);

		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("2");

		}
	}
}
	class Test4 extends Thread {

public void run() {

		
	for(int i=0;i<10;i++)
	{
        System.out.println("1");


}
}
}