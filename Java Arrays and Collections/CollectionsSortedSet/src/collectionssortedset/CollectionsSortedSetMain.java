package collectionssortedset;

import java.util.SortedSet;
import java.util.TreeSet;

/*
No indexing
Accepts ordering
No repetition
 */

public class CollectionsSortedSetMain {
	public static void main(String[] args) {
		
		//Ordered Set
		SortedSet <String> listSortedSet = new TreeSet<String>();
		
		//Add methods
		listSortedSet.add("Ryan");
		listSortedSet.add("Marissa");
		listSortedSet.add("Anny");
		listSortedSet.add("Fan");
		
		//Print
		System.out.println(listSortedSet);
		
	}

}
