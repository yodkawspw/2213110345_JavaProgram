
public class Date {
	private int dMonth; // variable to store the month
	private int dDay;
	private int dYear;
	
	//Default Constructor
	//Postcondition : dMonth=1;dDay=1,
	public Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1990;
	}
	
	//Constructor to set the date
	public Date(int month, int day,int year) {
		setDate(month,day,year);
	}
	
	//Method to set the date
	public void setDate(int month,int day,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	
	//Method to get month,day, and year
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	
	public int getYear() {
		return dYear;
	}
	
	public String toString() {
		return getMonth()+"-"+getDay()+"-"+getYear();
	}
}
