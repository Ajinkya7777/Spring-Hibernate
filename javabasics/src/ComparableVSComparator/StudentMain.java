package ComparableVSComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		StudentComparable student1 = new StudentComparable(5, "Ajinkya", 4.4d);
		StudentComparable student2 = new StudentComparable(2, "Swati", 4.4d);
		System.out.println("Student1.compareTo(Student2) :"+student1.compareTo(student2));
		
		List<StudentComparable> list = new ArrayList<StudentComparable>(Arrays.asList(student1,student2,
																							new StudentComparable(3,"shubham",5.42d),
																							new StudentComparable(4,"Gaurav",5.43d)
				));
		
					
	}
}
