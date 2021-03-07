package arithimetrichallenge;

// Problem ([6*(3+2)]²/3*2 - [(1-5)*(2-7)/2]²)³/ 10³ 
// Answer: 125

public class ArithimetriChallengeMain {
	
	public static void main(String[] args) {
		
		//First Setence
		double firstSetence = Math.pow(6*(3+2),2)/(3*2);
		
		
		//Second setence
		double secondSetence  =  Math.pow((1-5)*(2-7)/2,2);
		
		//Answer
		double answer = Math.pow(firstSetence - secondSetence,3)/Math.pow(10,3);
		
		//Answer print
		System.out.println(answer);
	}

}
