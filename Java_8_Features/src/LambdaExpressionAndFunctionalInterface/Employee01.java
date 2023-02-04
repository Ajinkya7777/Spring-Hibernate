package LambdaExpressionAndFunctionalInterface;

public class Employee01 {

	private int eNo;
	private String eName;
	private double dilayWage;

	public Employee01(int eNo, String eName, double dilayWage) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.dilayWage = dilayWage;
	}

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getDilayWage() {
		return dilayWage;
	}

	public void setDilayWage(double dilayWage) {
		this.dilayWage = dilayWage;
	}

	@Override
	public String toString() {
		return "Employee01 [eNo=" + eNo + ", eName=" + eName + ", dilayWage=" + dilayWage + "]";
	}

}

 class TimeSheet {
	private int eNo;
	private int days;
	public TimeSheet(int eNo, int days) {
		super();
		this.eNo = eNo;
		this.days = days;
	}
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "TimeSheet [eNo=" + eNo + ", days=" + days + "]";
	}
	
	
}

