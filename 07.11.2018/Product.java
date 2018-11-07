package arrayListClassExercise;

public class Product {
	private double weight;
	private String productName;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = (weight >= 0) ? weight : 0;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Product(double weight, String productName) {
		super();
		this.weight = weight;
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "Product [weight=" + weight + ", productName=" + productName + "]";
	}
	
	

}
