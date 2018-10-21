package airportCrew;

public abstract class Person {
	private String name, surname;

	
	//-----------------Setters and Getters--------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	//-----------------Functions--------------------
	
	public void print(){
		System.out.println("name : "+getName()+", "+"surname : "+getSurname());
	}

}
