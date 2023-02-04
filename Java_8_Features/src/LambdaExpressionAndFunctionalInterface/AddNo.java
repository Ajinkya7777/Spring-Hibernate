package LambdaExpressionAndFunctionalInterface;

interface Interf {
	public void add(int a, int b);
}

class AddNo {

	public static void main(String[] args) {
		Interf i = (int a,int b) -> System.out.println("Addition of Two numbers:" +a+ "+"+b+"= "+(a+b));
		i.add(20, 10);
		i.add(100, 100);
	}
}
