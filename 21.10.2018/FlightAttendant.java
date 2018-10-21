package airportCrew;

public class FlightAttendant extends Person {
	
	private int seniority;
	private String countryOfOrigin;
	private String flightClass;
	
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
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	
	//-----------------Constructors--------------------

	public FlightAttendant(int seniority, String countryOfOrigin, String flightClass) {
		super();
		this.seniority = seniority;
		this.countryOfOrigin = countryOfOrigin;
		this.flightClass = flightClass;
	}
	
	//-----------------Functions--------------------

	public void print() {
		super.print();
		System.out.println("countryOfOrigin : "+getCountryOfOrigin()+" , "+
							"flightClass : "+getFlightClass()+" , "+
							"seniority : "+getSeniority());
		}

}
