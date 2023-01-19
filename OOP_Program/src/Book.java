import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String Title) {
		title = Title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(float string) {
		price = string;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPublishyear(int year) {
		publishyear = year;
	}
	
	public int getPublishyear() {
		return publishyear;
	}
	
	public int getTotalYear() {
		return Year.now().getValue() - publishyear;
	}
	
	public String toString() {
		return String.format("Title: "+getTitle()+" published for "+getTotalYear()+" year ("+getPrice()+" baht).");
	}
}
