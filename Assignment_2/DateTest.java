class Date{
	private int day,month,year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println(month+"/"+day+"/"+year);
	}
}


public class DateTest {

	public static void main(String[] args) {
		Date d1=new Date(12,2,2021);
		System.out.println("Date=>");
		d1.displayDate();
	}

}
