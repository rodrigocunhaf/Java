package colletionsset;

import java.util.HashSet;
import java.util.Set;

/*
 * No indexing
 * Without sorting
 * No repetition
 */
public class CollectionsSetMain {
	
	public static void main(String[] args) {
	
	//Set list
	Set <String> listSet = new HashSet <String>();
	
	//Add Set
	listSet.add("Ryan");
	listSet.add("Marissa");
	
	//First print
	System.out.println(listSet);
	
	//Removed Marissa
	listSet.remove("Marissa");
	
	//Second print
	System.out.println(listSet);
	
	}
}
