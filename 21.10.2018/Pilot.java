package airportCrew;

public class Pilot extends Person {
	private int pilotLicenseNumber;
	private int seniority;
	
	
	//-----------------Setters and Getters--------------------
	public int getPilotLicenseNumber() {
		return pilotLicenseNumber;
	}
	public void setPilotLicenseNumber(int pilotLicenseNumber) {
		this.pilotLicenseNumber = (pilotLicenseNumber>0) ? pilotLicenseNumber : 0;
	}
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = (seniority>0) ? seniority : 0;
	}
	
	//-----------------Constructor--------------------
	
	public Pilot(String name, String surname, int pilotLicenseNumber, int seniority) {
		super(name, surname);
		this.pilotLicenseNumber = pilotLicenseNumber;
		this.seniority = seniority;
	}
	
	//-----------------Functions--------------------
	
	public void print() {
		super.print();
		System.out.println("pilotLicenseNumber : "+getPilotLicenseNumber()+" , "+
							"seniority : "+getSeniority());
	}
	

}
