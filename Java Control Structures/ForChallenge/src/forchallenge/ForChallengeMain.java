package forchallenge;

/*
 String  word  =  "#";
		for (int i = 1; i<= 5;i++) {
			System.out.println(word);
			word+="#";
 */

public class ForChallengeMain {
	
	public static void main(String[] args) {
		
		for (String i = "#"; !i.equals("######");i+="#") {
			
			System.out.println(i);
		}
	}
}