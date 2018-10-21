package airportCrew;

public class Passenger extends Person {
	private int passportNum;

	
	//-----------------Setters and Getters--------------------
	
	public int getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(int passportNum) {
		this.passportNum = (passportNum>0) ? passportNum : 0;
	}
	
	//-----------------Constructor--------------------
	
	public Passenger(int passportNum) {
		super();
		this.passportNum = passportNum;
	}

	//-----------------Functions--------------------

	public void print() {
		super.print();
		System.out.println("passportNum : "+getPassportNum());
	}
	
}
