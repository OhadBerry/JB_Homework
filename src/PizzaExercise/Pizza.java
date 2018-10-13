package PizzaExercise;

public class Pizza {
	private double diameter;
	private byte slices,toppings;
	
	public void print() {
		System.out.println("The Pizza's details are:");
		System.out.println("diameter : "+diameter+" | slices: "+slices+"| toppings: "+toppings);
	}
	
	public boolean isBasicPizza() {
		if (toppings == 0)
			return true;
		else
			return false;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		if (diameter >= 10 && diameter <=50)
			this.diameter = diameter;
		else
			System.out.println("The diameter must be between 10 and 50");
	}

	public byte getSlices() {
		return slices;
	}

	public void setSlices(byte slices) {
		if (slices >= 1 && slices <=8)
			this.slices = slices;
		else
			System.out.println("Number of slices must be between 1 and 8");
	}

	public byte getToppings() {
		return toppings;
	}

	public void setToppings(byte toppings) {
		if (toppings >= 0 && toppings <=5)
			this.toppings = toppings;
		else
			System.out.println("Number of toppings must be between 0 and 5");
		
	}

	public Pizza(double diameter, byte slices, byte toppings) {
		super();
		if (diameter >= 10 && diameter <=50)
			this.diameter = diameter;
		else
			System.out.println("The diameter must be between 10 and 50");
	
		if (slices >= 1 && slices <=8)
			this.slices = slices;
		else
			System.out.println("Number of slices must be between 1 and 8");
		
		if (toppings >= 0 && toppings <=5)
			this.toppings = toppings;
		else
			System.out.println("Number of toppings must be between 0 and 5");
	}

}
