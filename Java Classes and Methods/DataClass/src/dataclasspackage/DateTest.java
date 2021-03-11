package dataclasspackage;

public class DateTest {
	
	public static void main(String[] args) {
	
	DateClass date1 = new DateClass();
	
	date1.day = 01;
	date1.month = 12;
	date1.year = 1997;
	
	DateClass date2 = new DateClass();
	
	date2.day = 02;
	date2.month = 03;
	date2.year = 1933;
	
	System.out.printf("Date: %d/%d/%d\n",date1.day,date1.month,date1.year);
	
	System.out.printf("Date: %d/%d/%d",date2.day,date2.month,date2.year);
	
	}
}
