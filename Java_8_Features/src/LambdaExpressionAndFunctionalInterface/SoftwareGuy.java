package LambdaExpressionAndFunctionalInterface;

public class SoftwareGuy {
	private String name;
	private String desg;
	private String loc;
	private double salary;
	
	public SoftwareGuy(String name, String desg, String loc, double salary) {
		super();
		this.name = name;
		this.desg = desg;
		this.loc = loc;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public String toString() {
		return String.format("%s %s %s %.2f" ,name,desg,loc,salary);
	}
}
