package setcalldate;

public class DateClass {
	int day;
	int month;
	int year;
	
	//Return formated date
	String getDate() {
		return this.day+"/"+this.month+"/"+ this.year;
	}

}