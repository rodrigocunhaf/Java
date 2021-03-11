package challenge1970DateClass;

public class DateClass1970Test {
	
	public static void main(String[] args) {
		
		//Create date #1 [Constructor #1]
		DateClass1970 date = new DateClass1970();
		
		//Print Date #1
		System.out.println(date.getDate());
		
		//Create date #2 [Constructor #2]
		DateClass1970 date2 = new DateClass1970(11,03, 2021);
		
		//Print date #2
		System.out.println(date2.getDate());
		
		
	}

}
