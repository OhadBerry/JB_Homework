import java.util.Comparator;

public class StudentNameSorter implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		return s1.getName().compareToIgnoreCase(s2.getName());
	}
}


