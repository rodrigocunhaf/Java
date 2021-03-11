package classmembersvsinstace;

public class ProductTest {
	public static void main(String[] args) {
		
		//Product #1
		ProductClass p1 = new ProductClass("Notebook",6000);
		
		//Product #2
		ProductClass p2 = new ProductClass("Smartphone",1200);
		
		//Price Product #1 default discount
		System.out.printf("Product: %s , price (default discount): R$ %.2f\n",p1.name,p1.DefaultDiscount());
		
		//Price Product #2 default discount
		System.out.printf("Product: %s , price (default discount): R$ %.2f\n",p2.name,p2.DefaultDiscount());
		
		//Custom discount, Static variable class
		ProductClass.discount = 0.5;
		
		//Price Product #2 custom discount
		System.out.printf("Product: %s , price (custom discount): R$ %.2f\n",p1.name,p1.DefaultDiscount());
		
		//Price Product #2 custom discount
		System.out.printf("Product: %s , price (custom discount): R$ %.2f\n",p2.name,p2.DefaultDiscount());
	}
}
