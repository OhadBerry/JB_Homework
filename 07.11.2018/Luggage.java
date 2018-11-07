package arrayListClassExercise;

import java.util.ArrayList;

public class Luggage {
	private double totalLuggageWeight;
	private ArrayList <Product> productList;
	
	public double getTotalLuggageWeight() {
		return totalLuggageWeight;
	}
	public void setTotalLuggageWeight(double totalLuggageWeight) {
		this.totalLuggageWeight = totalLuggageWeight;
	}
	public ArrayList<Product> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
	
	public void addProduct(Product product) {
		productList.add(product);
		setTotalLuggageWeight(getTotalLuggageWeight()+product.getWeight());
	}
	
	public void removeProduct(int index) {
		productList.remove(index);
		setTotalLuggageWeight(getTotalLuggageWeight()-productList.get(index).getWeight());
	}
	



}
