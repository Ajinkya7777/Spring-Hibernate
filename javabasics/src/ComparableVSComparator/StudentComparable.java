package ComparableVSComparator;

public class StudentComparable implements Comparable<StudentComparable>{

	private String name;
	private Integer rollNo;
	private Double grades;
	public StudentComparable(Integer rollNo, String name, Double grades) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grades = grades;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Double getGrades() {
		return grades;
	}
	public void setGrades(Double grades) {
		this.grades = grades;
	}
	
	public String toString() {
		return "RollNo: "+this.rollNo+" Name: "+this.name+" Grades: "+this.grades;
	}

	@Override
	public int compareTo(StudentComparable student) {
		
		
		return Integer.compare(this.rollNo, student.rollNo);
	}

}
