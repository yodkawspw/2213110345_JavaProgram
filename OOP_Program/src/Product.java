
public class Product {
	private String id;
	private int unit;
	private double price;
	
	public void setId(String ID) {
		id = ID;
	}//end setID();
	
	public String getId() {
		return id;
	}//end getId()
	
	public void setUnit(int UNIT) {
		unit = UNIT;
	}//end setUnit()
	
	public int getUnit() {
		return unit;
	}//end getUnit
	
	public void setPrice(double PRICE) {
		price = PRICE;
	}//end setPrice
	
	public double getPrice() {
		return price;
	}//end getPice()
	
	public double calculate() {
		double total = unit*price;
		return total;
	}//end calculate()
}
