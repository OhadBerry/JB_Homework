package johnbryce;


import java.util.ArrayList;

public class ClothingItem {
	private String manufacturer;
	 private String model;
	 private String type;
	 private float price;
	 private String size;
	 ArrayList < String > colors = new ArrayList<String>();


	 //Constructor
	 public ClothingItem(String manufacturer, String model, String type, float price, String size,
				ArrayList<String> colors) {
			super();
			setManufacturer(manufacturer);
			setModel(model);
			setType(type);
			setPrice(price);
			setSize(size);
			for (String c : colors)
				this.colors.add(c);	
		}
	 
	 
	 // Getter Methods 

	 public String getManufacturer() {
	  return manufacturer;
	 }

	public String getModel() {
	  return model;
	 }

	 public String getType() {
	  return type;
	 }

	 public float getPrice() {
	  return price;
	 }

	 public String getSize() {
	  return size;
	 }
	 
	 public String getColor(int index) {
		  return colors.get(index);
	 }

	 // Setter Methods 

	 public void setManufacturer(String manufacturer) {
	  this.manufacturer = manufacturer;
	 }

	 public void setModel(String model) {
	  this.model = model;
	 }

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setPrice(float price) {
	  this.price = price;
	 }

	 public void setSize(String size) {
	  this.size = size;
	 }
	 
	 public boolean setColor(String color) {
		  return colors.add(color);
	 }

	 
	 // ToString Method
	 @Override
		public String toString() {
			return "{\n"
					+ "\"manufacturer\":" + manufacturer  			+"\",\n" 
					+ " \"model\": \"" + model 						+"\",\n"
					+ " \"type\": \"" + type 						+"\",\n"
					+ " \"price\": " + price						+",\n"
					+ " \"size\": \"" + size 						+"\",\n"
					+ " \"colors\":" + colors 						+"\n}\n";
		}
	 
	}