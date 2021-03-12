package collectionslist;

import java.util.ArrayList;

public class CollectionsList {
	public static void main(String[] args) {
		
		//ArrayList UserClass
		ArrayList <UserClass> listUser = new ArrayList<UserClass>();
		
		//Add Methods
		listUser.add(new UserClass("Ryan"));
		listUser.add(new UserClass("Marissa"));
		listUser.add(new UserClass("Lia"));
		
		//Print full Arraylist
		System.out.println("Full Arraylist: ");
		for( UserClass user : listUser) {
			System.out.println("["+user.name+"]");
		}
		
		//Remove Marissa
		System.out.println("Removed Marissa, ArrayList index(1): ");
		listUser.remove(1);
		
		//Print Names
		for( UserClass user : listUser) {
			System.out.println("["+user.name+"]");
		}
		
		//Getter Method
		System.out.printf("Get ArrayList index(1): [%s] ",listUser.get(1).name);
	}
}
