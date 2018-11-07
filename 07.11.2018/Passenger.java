package arrayListClassExercise;

public class Passenger {
	private double flightPrice;
	private double allowedLuggageWeight;
	private Luggage suitcase;
	private double priceForAdditionalWeight;
	
	public double getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(double flightPrice) {
		this.flightPrice = flightPrice;
	}
	public double getAllowedLuggageWeight() {
		return allowedLuggageWeight;
	}
	public void setAllowedLuggageWeight(double allowedLuggageWeight) {
		this.allowedLuggageWeight = allowedLuggageWeight;
	}
	public Luggage getSuitcase() {
		return suitcase;
	}
	public void setSuitcase(Luggage suitcase) {
		this.suitcase = suitcase;
	}
	public double getPriceForAdditionalWeight() {
		return priceForAdditionalWeight;
	}
	public void setPriceForAdditionalWeight(double priceForAdditionalWeight) {
		this.priceForAdditionalWeight = priceForAdditionalWeight;
	}
	
	

}
