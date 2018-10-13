package PizzaExercise;

public class PizzaApp {

	public static void main(String[] args) {
		Pizza[] pizzas = new Pizza[5];
		pizzas[0] = new Pizza(10.0, (byte)6,(byte) 0);
		pizzas[1] = new Pizza(20.0, (byte)8, (byte)1);
		pizzas[2] = new Pizza(30.0, (byte)8, (byte)2);
		pizzas[3] = new Pizza(40.0, (byte)8, (byte)3);
		pizzas[4] = new Pizza(50.0, (byte)8, (byte)4);

		for (int i = 0; i < pizzas.length; i++) {
			System.out.println("Is pizza "+ i +" a basic pizza? "+pizzas[i].isBasicPizza());
		}
		
		for (int i = 0; i < pizzas.length; i++) {
			System.out.println("------------------------------------------------");
			pizzas[i].print();
		}
		
		int sumOfToppings = 0;
		
		System.out.println("------------------------------------------------");

		for (int i = 0; i < pizzas.length; i) {
			sumOfToppings += pizzas[i].getToppings(); 
		}
		
		System.out.println("sum of all the toppings is: "+sumOfToppings);
	}

}
