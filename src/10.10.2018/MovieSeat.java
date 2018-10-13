
public class MovieSeat {
	private double price;
	private boolean isTaken;
	
	public MovieSeat(double price, boolean isTaken) {
		super();
		this.price = price;
		this.isTaken = isTaken;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isTaken() {
		return isTaken;
	}
	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}
	
	

}
