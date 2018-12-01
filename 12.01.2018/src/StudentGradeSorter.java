import java.util.Comparator;

public class StudentGradeSorter implements Comparator<Student>{
	//-----------------this function overrides the "Comparator" interface-----------------------------
		/*
		 Parameters: 2 PARAMETERS OF THE TYPRE THAT WE DEFINED IN THE GENERIC INTERFACE
		 
		 Returns: 
		 		- a negative integer - as the first param object is less than the second param
		 		- a positive integer - as the first param is greater than the second param
		 		- a zero - as the first param is equal to the second param
		 */
	
	public int compare(Student s1, Student s2) {
		return s1.getGrade() - s2.getGrade();
	}

}
