package conversionchallenge;

import java.util.Scanner;

//Calculate the average of 3 wages provided in String

public class ConversionChallengeMain {
	
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//First message scanner
		System.out.println("Inform the first salary: ");
		
		//First Salary String replacing "," with "."
		String s1 = scan.nextLine().replace(",", ".");
		
		//convert s1 to double
		Double doubles1 = Double.parseDouble(s1);
		
		//Second message scanner
		System.out.println("Inform the second salary: ");
		
		//Second Salary String replacing "," with "."
		String s2 = scan.nextLine().replace(",", ".");
		
		///convert s2 to double
		Double doubles2 = Double.parseDouble(s2);
		
		//Third message scanner
		System.out.println("Inform the third salary: ");
		
		//Third Salary String replacing "," with "."
		String s3 = scan.nextLine().replace(",", ".");
		
		//Convert s3 to double
		Double doubles3 = Double.parseDouble(s3);
		
		
		//sum: s1,s2,s3 wages 
		System.out.println(doubles1+doubles2+doubles3/3);	
		
		//Scanner close
		scan.close();
	}

}
