package clientbuy;

public class Itens {
	//Product quantity buyed
	int quanty;
	
	//Product variable
	Product product;
	
	//Itens Constructor
	public Itens(int quanty, String productName, double productPrice) {
		
		//Itens quanty attribution
		this.quanty = quanty;
		
		//Set and Create object product
		this.product = new Product(productName,productPrice);
		
		//Set and multiplies the price by the quantity
		this.product.price*=quanty;
		
	}
}
