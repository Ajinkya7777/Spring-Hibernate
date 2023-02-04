package DefaultAndStaticMethods;

interface Inter2 {
	
	public void print1();
	
	static void print2() {
		System.out.println("Print2 is static methods");
	}
	static void print3() {
		System.out.println("Print3 is static methods");
	}
}



public class StaticDemo implements Inter2{
	
	
	public static void main(String[] args) {
		
		StaticDemo s =  new StaticDemo ();
		s.print1();
		Inter2.print2();
		Inter2.print3(); //Static methods are called by using super interface in this case Inter2
	}

	@Override
	public void print1() {
		
		System.out.println("Print1 is abstract method");
	}

}
