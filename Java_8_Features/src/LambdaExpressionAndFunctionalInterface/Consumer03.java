package LambdaExpressionAndFunctionalInterface;

import java.util.function.Consumer;

//this is example of Consumer chaining

class Test5 {
	private String name;
	private String result;
	public Test5(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Test5 [name=" + name + ", result=" + result + "]";
	}
	
	
	
}
 class Consumer03 {
	public static void main(String[] args) {
		
		Consumer<Test5> c1 = t->  System.out.println("Movie Name:" +t.getName());
		Consumer<Test5> c2 = t->  System.out.println("Movie Result:" +t.getResult());
		Consumer<Test5> c3 = t->  System.out.println(t.getName()+" stored in Database:\n" );
		
		Test5 chain1 = new Test5("Fight Club ", "Hit");
		Test5 chain2 = new Test5("Champion", "Flop");
		
		c1.andThen(c2).andThen(c3).accept(chain1);  //chaining of Consumer
		c1.andThen(c2).andThen(c3).accept(chain2);
																
		
		
	}
}
