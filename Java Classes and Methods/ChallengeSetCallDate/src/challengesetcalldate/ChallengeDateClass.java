package challengesetcalldate;

public class ChallengeDateClass {
	int day;
	int month;
	int year;
	
	//Return formated date
	String getDate() {
		return this.day+"/"+this.month+"/"+ this.year;
	}

}