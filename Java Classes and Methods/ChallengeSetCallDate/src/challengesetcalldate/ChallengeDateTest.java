package challengesetcalldate;

public class ChallengeDateTest {
	
	public static void main(String[] args) {
	
	//Create object #1, class type DateClass
	ChallengeDateClass date1 = new ChallengeDateClass();
	
	date1.day = 01;//Set day
	date1.month = 12;//Set month
	date1.year = 1997;//Set year
	
	//Create object #2, class type DateClass
	ChallengeDateClass date2 = new ChallengeDateClass();
	
	date2.day = 02; //Set day
	date2.month = 03;//Set month
	date2.year = 1933;//Set year
	
	//Print Date #1
	System.out.println("Date: "+date1.getDate());

	//Print Date #2
	System.out.println("Date: "+date2.getDate());
	
	
	}
}
