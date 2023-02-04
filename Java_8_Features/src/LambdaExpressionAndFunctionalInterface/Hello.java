package LambdaExpressionAndFunctionalInterface;

 interface Inter {

	public void print(String s);
}

 class Hello {
	public static void main(String[] args) {
		
		Inter i =  s -> System.out.println(s);
		i.print("Hello World");
	}
}