package conversionchallenge;

import java.util.Scanner;


public class ConversionChallengeMain {
	
	public static void main(String[] args) {
		
		System.out.println(":");
		
		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.nextLine().replace(",", ".");
		Double doubles1 = Double.parseDouble(s1);
		
		String s2 = scan.nextLine().replace(",", ".");
		Double doubles2 = Double.parseDouble(s2);
		
		String s3 = scan.nextLine().replace(",", ".");
		Double doubles3 = Double.parseDouble(s3);
		
		System.out.println(doubles1+doubles2+doubles3);
		
		
		scan.close();
	}

}
