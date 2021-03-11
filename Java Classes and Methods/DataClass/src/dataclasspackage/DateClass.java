package dataclasspackage;

public class DateClass {
	int day;
	int month;
	int year;
	
	String getDate() {
		return this.day+"/"+this.month+"/"+ this.year;
	}

}