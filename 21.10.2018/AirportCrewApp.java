package airportCrew;

public class AirportCrewApp {

	public static void main(String[] args) {
		FlightAttendant flightAttendant1 = new FlightAttendant(1234, "Israel","economy"); 
		Passenger passenger1 = new Passenger(1234);
		GroundAttendant groundAttendant1 = new GroundAttendant(3, "Iran", "Security");
		Pilot pilot1 = new Pilot(123,3);
		
		flightAttendant1.print();
		passenger1.print();
		groundAttendant1.print();
		pilot1.print();
		
		
		

	}

}
