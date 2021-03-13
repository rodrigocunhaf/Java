package clientbuy;

import java.util.ArrayList;

public class Purchasing {
	
	//Purchasing List
	ArrayList <Itens> purchasingList = new ArrayList<Itens>();
	
	//Buyed item ( quantity itens, product name, product price)
	void buyItem(int quanty ,String name, double price) {
		
		//Create object Item
		Itens item = new Itens(quanty, name, price);
		
		//Add in purchasingList
		this.purchasingList.add(item);
		
	}
	
}
