package logicalchallenge;

/*Did you work Monday or Tuesday? bought a smartphone or notebook, went out to dinner?
 -->Worked Monday and Thursday buys smartphone and will have dinner Sunday night.
 -->If you bought the notebook or smartphone then you will go out to dinner on Sunday night.
 -->If you don't work on Monday and Tuesday, then you won't have dinner on Sunday night
 */
		
public class LogicalChallengeMain {
	
	public static void main(String[] args) {
		
		//Worked Tuesday?
		boolean workTuesday = false;
		
		//Worked Thursday?
		boolean workThursday = false;
		
		//Worked two days? buy Smartphone?
		boolean buySmartphone = workThursday && workTuesday;
		
		//Bought Notebook?
		boolean buyNotebook = workThursday ^ workTuesday;
		
		//Bought Notebook or Smartphone?
		boolean sundayNightDinner = buySmartphone || buyNotebook;
		
		//Answer:
		System.out.println("Bought Smartphone? "+buySmartphone);
		
		System.out.println("Bought Notebook? "+buyNotebook);
		
		System.out.println("Went out to dinner on sunday night? "+sundayNightDinner);
		
	}

}
