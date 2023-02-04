package LambdaExpressionAndFunctionalInterface;

public class ReplaceAnonymousByLambda {

	public static void main(String[] args) {
		
		 Runnable r = 
			  ()-> { for (int i = 0; i < 10; i++) {
				 System.out.println("Child Thread: Lambda");
			} };
		 Thread t = new Thread(r);
		 t.start();
		 t.setPriority(10);
		 System.out.println(t.getPriority());
		 System.out.println();
		 for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread: Lambda");
		}
}
}