package classmembersvsinstace;

public class ProductClass {
	//Product name
	String name ;
	
	//Product price
	double price;
	
	//Static variable discount
	static double discount = 0.25; 
	
	//Class Constructor
	public ProductClass(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Set Discount
	public double DefaultDiscount() {
		return this.price*(1-discount);
	}
	
}
