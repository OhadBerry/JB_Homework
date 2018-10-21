package airportCrew;

public class GroundAttendant extends Person {
	
	private int seniority;
	private String countryOfOrigin;
	private String groundFunction;
	
	//-----------------Setters and Getters--------------------

	
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = (seniority>0) ? seniority : 0;
	}
	
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getGroundFunction() {
		return groundFunction;
	}
	public void setGroundFunction(String groundFunction) {
		this.groundFunction = groundFunction;
	}
	
	//-----------------Constructors--------------------
	
	public GroundAttendant(int seniority, String countryOfOrigin, String groundFunction) {
		super();
		this.seniority = seniority;
		this.countryOfOrigin = countryOfOrigin;
		this.groundFunction = groundFunction;
	}
	
	//-----------------Functions--------------------
	
	public void print() {
		super.print();
		System.out.println("countryOfOrigin : "+getCountryOfOrigin()+" , "+
							"groundFunction : "+getGroundFunction()+" , "+
							"seniority : "+getSeniority());
		}
	
	

}
