package LambdaExpressionAndFunctionalInterface;

public class Employees {
	private String name;
	private double Salary;
	public Employees(String name, double salary) {
		super();
		this.name = name;
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Emoloyees [name=" + name + ", Salary=" + Salary + "]";
	}
	


}
