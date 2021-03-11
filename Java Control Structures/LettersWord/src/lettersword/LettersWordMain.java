package lettersword;

import java.util.Scanner;

//Get letters in entry word
public class LettersWordMain {
	public static void main(String[] args) {
		
		//Scanner
		Scanner scan =  new Scanner(System.in);
		
		//Input word
		System.out.print("Entry word :");	
		String word = scan.nextLine();
		
		//Print Letters in entry word
		for (int i = 0; i < word.length();i++) {
			System.out.print("["+word.charAt(i)+"]");
		}
		
		//Scanner close
		scan.close();
	}

}
