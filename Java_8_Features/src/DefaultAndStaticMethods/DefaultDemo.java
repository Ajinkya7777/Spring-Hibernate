package DefaultAndStaticMethods;

interface Inter {
	public void print1();

	default void print2() {
		System.out.println("Print 2 is default method");
	}

	default void print3() {
		System.out.println("Print 3 is default method");
	}
}

 class DefaultDemo implements Inter {

	@Override
	public void print1() {

		System.out.println("Print1 is abstract method");
	}
	
		public static void main(String[] args) {
			DefaultDemo d = new DefaultDemo();
			d.print1();
			d.print2();
			d.print3();
		}

}
