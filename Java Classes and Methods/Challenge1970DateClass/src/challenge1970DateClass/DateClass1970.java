package challenge1970DateClass;

public class DateClass1970 {
	int day;
	int month;
	int year;
	
	//Return formated date
	String getDate() {
		return this.day+"/"+this.month+"/"+ this.year;
	}
	
	//Constructor #1
	public DateClass1970() {
		this.day = 01;
		this.month = 01;
		this.year = 1970;
	}
	
	//Constructor #2
	public DateClass1970(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
}