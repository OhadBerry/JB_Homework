package arrayListClassExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		double flightPrice = Math.random()*900 + 100;
		double allowedLuggageWeight = Math.random()*90 + 10;
		double priceForAdditionalWeight = Math.random()*90 + 10;
		
		String[] arrayOfRandomNames = {	"Laptop","Pen","Ipod","Lipstick","Cheese","Pizza",
										"Book","Soap","Shirt","Pants","Shoes","Hat","Sunglasses",
										"Wig","Guitar","Cellphone","Camera","DVD","Map","GPS"};
		
		int numberOfItemsInSuitcase = (int)(Math.random()*5)+5;
		
		//Defining a new Luggage object with a valid ArrayList
		Luggage suitcase = new Luggage();
		suitcase.setProductList(new ArrayList<Product>());
		
		//Filling suitcase with items containing random generated weight and names 
		for (int i = 0; i < numberOfItemsInSuitcase; i++) {
			double itemRandomWeight = Math.random()*16+1;
			int randomNameNumber = (int)(Math.random()*19);
			suitcase.addProduct(new Product(itemRandomWeight, arrayOfRandomNames[randomNameNumber]));
		}
		
		//Creating a new passenger with the created fields
		Passenger myPassenger = new Passenger();
		myPassenger.setAllowedLuggageWeight(allowedLuggageWeight);
		myPassenger.setFlightPrice(flightPrice);
		myPassenger.setPriceForAdditionalWeight(priceForAdditionalWeight);
		myPassenger.setSuitcase(suitcase);
		
		//define variable overWeight which when positive contains the value of weight which exceeds the allowed weight
		double overWeight = myPassenger.getSuitcase().getTotalLuggageWeight() - myPassenger.getAllowedLuggageWeight();
		
		//define variable "overWeightCharge" which contains the amount of money a passenger will be charged for overweight luggage
		double overWeightCharge = overWeight * myPassenger.getPriceForAdditionalWeight();
		
		Scanner sc = new Scanner(System.in);

		if (overWeight > 0) {
			System.out.println("Luggage is "+overWeight+" overweight, do you wish to pay for overweight luggage?");
			String answer = sc.nextLine();
			while (!answer.equals("Yes") && !answer.equals("No"))
			{
				System.out.println("Please enter a valid answer: Yes/No");
				answer = sc.nextLine();
			}
			if (answer.equals("Yes"))
				System.out.println("Passenger must pay : "+overWeightCharge+"$");
			else if (answer.equals("No")) {
				while (overWeight > 0) {
					for (int i = 0; i < myPassenger.getSuitcase().getProductList().size(); i++) {
						System.out.println("Product in index number "+i+","+myPassenger.getSuitcase().getProductList().get(i).toString());
					}
					System.out.println("Overweight is: "+overWeight);
					System.out.println("Please enter the index of the item you wish to remove from your suitcase");
					int indexOfItemToRemove = sc.nextInt();
					myPassenger.getSuitcase().removeProduct(indexOfItemToRemove);
					overWeight = myPassenger.getSuitcase().getTotalLuggageWeight() - myPassenger.getAllowedLuggageWeight();
				}	
			}
		}
		sc.close();
	}
	

}
