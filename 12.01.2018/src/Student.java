
public class Student {
	
	//-----------------------------Properties--------------------------
	private int grade;
	private int age;
	private String name;

	//-----------------------------Setters and Getters--------------------------
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = (grade >= 0 && grade <= 100) ? grade : 0;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = (age >= 18 && age <= 120) ? age : 18;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	
	public Student(int grade, int age, String name) {
		super();
		this.setGrade(grade);
		this.setAge(age);
		this.setName(name);
	}

	//-----------------------------Methods--------------------------
	
	@Override
	public String toString() {
		return "Student: grade = " + grade + ", age = " + age + ", name = " + name + "";
	}

}
