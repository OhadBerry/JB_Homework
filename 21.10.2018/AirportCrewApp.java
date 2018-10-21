package airportCrew;

public class AirportCrewApp {

	public static void main(String[] args) {
		FlightAttendant flightAttendant1 = new FlightAttendant("Jessica","Braun",1234, "Israel","economy"); 
		Passenger passenger1 = new Passenger("Jessie","Smith",1234);
		GroundAttendant groundAttendant1 = new GroundAttendant("Bob","Constructor",3, "Iran", "Security");
		Pilot pilot1 = new Pilot("Shimon","Peres",123,3);
		
		flightAttendant1.print();
		passenger1.print();
		groundAttendant1.print();
		pilot1.print();
		
		
		

	}

}
