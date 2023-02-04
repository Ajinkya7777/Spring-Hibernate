package javabasics;

public class StudentMain {
	 public static void main(String[] args) {
		
		 Student student = new Student("Ajinkya", 1);
		 Course course = new Course("Java", 5000.0);
		 student.setCourse(course);
		System.out.println(student.getCourse().getTitle()+"\n"+student.getCourse().getPrice());
		 System.out.println(" Name : "+student.getName()+"\n RollNo : "+student.getRollNo()+"\n Course : "+course.getTitle()+"\n Price : "+course.getPrice());
	}
}
