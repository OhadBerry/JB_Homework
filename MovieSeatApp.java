package ClassExercises;

import java.util.Scanner;

public class MovieSeatApp {

	public static void main(String[] args) {
		MovieSeat[][] theatre = new MovieSeat[4][3];
		
		for (int i = 0;  i < theatre.length; i++) {
			for (int j = 0; j < theatre[i].length; j++) {
				theatre[i][j] = new MovieSeat((Math.random()*(90-70)+70),false); 
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of seats you are intrested in purchasing: ");
		int numberOfBoughtSeats = sc.nextInt();
		for (int i = 0; i < numberOfBoughtSeats; i++) {
			System.out.print("Please enter the desired row (between 0 and 4): ");
			int seatRow = sc.nextInt();
			System.out.print("Please enter the desired column(between 0 and 3) : ");
			int seatColumn = sc.nextInt();
			while (theatre[seatRow][seatColumn].isTaken() == true) {
				System.out.println("Sorry, the seat is taken, please chose another seat");
				System.out.print("Please enter the desired row (between 0 and 4): ");
				seatRow = sc.nextInt();
				System.out.print("Please enter the desired column(between 0 and 3): ");
				seatColumn = sc.nextInt();
			}
			theatre[seatRow][seatColumn].setTaken(true);
		}
		sc.close();
	}

}
