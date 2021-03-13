package clientbuy;

public class Client {
	//Client Name
	String name;
	
	//Total purchasing
	double totalPurchasing  = 0;
	
	//Create purchasing list
	Purchasing  purchasing =  new Purchasing();
	
	//Client constructor
	public Client(String name) {
		this.name = name;
	}
	
	//Print client name, product quantity, name product ,price product and total purchasing 
	public void getTotal() {
		
		//Print client name
		System.out.printf("\nClient:[%s]\n",this.name);
		
		//Iteration within the shopping list
		for (Itens itens : purchasing.purchasingList) {
			
			//Sum accumulator and price product
			this.totalPurchasing+=itens.product.price;
			System.out.printf("Quanty: [%d] Product: [%s] Price [R$ %.2f]\n",itens.quanty,itens.product.name,itens.product.price);
		}
		
		//Print total purchasing
		System.out.printf("Total: R$ %.2f",this.totalPurchasing);
	}
}
