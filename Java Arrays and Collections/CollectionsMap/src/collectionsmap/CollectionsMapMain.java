package collectionsmap;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMapMain {
	public static void main(String[] args) {
		
		Map <Integer, String> mapList = new HashMap<Integer, String>();
		
		//Add elements
		mapList.put(1,"Ryan");
		mapList.put(2,"Clair");
		mapList.put(3,"Marissa");
		mapList.put(4,"Bruce");
		
		//Print Full Maplist
		System.out.println("Full Maplist: "+mapList);
		
		//Print Key 
		System.out.println("Keys Maplist: "+mapList.keySet());
		
		//Print values
		System.out.println("Values Maplist: "+mapList.values());
		
		//Print value in key
		System.out.println("Key value (2): "+mapList.get(2));
		
		//Remove key value (Marissa)
		mapList.remove(2);
		
		//Print list
		System.out.println("Removed Marissa, new Maplist: "+mapList);
		
	}

}
