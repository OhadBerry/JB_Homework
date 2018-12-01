import java.util.ArrayList;
import java.util.Collections;


public class StudentApp {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(100, 21, "Bob"));
		studentList.add(new Student(55, 23, "Alice"));
		studentList.add(new Student(88, 20, "Joana"));
		studentList.add(new Student(93, 28, "Richard"));
		studentList.add(new Student(75, 32, "John"));
		
		for (Student s : studentList) {
			System.out.println(s.toString());
		}
				
		Collections.sort(studentList, new StudentAgeSorter());
		System.out.println("-----------------Sorted by Age----------------");
		for (Student s : studentList) {
			System.out.println(s.toString());
		}
		
		Collections.sort(studentList, new StudentGradeSorter());
		System.out.println("-----------------Sorted by Grade----------------");
		for (Student s : studentList) {
			System.out.println(s.toString());
		}
		
		Collections.sort(studentList, new StudentNameSorter());
		System.out.println("-----------------Sorted by Name----------------");
		for (Student s : studentList) {
			System.out.println(s.toString());
		}

		
		

	}

}
