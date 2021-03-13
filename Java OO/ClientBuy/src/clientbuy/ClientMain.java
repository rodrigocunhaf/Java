package clientbuy;

public class ClientMain {
	public static void main(String[] args) {
		
		Client client1 = new Client("Rodrigo");
		
		client1.purchasing.buyItem(1, "TV", 1500);
		client1.purchasing.buyItem(3, "Mouse",35);
		
		Client client2 = new Client("Ana");
		
		client2.purchasing.buyItem(1, "Notebook", 6500);
		client2.purchasing.buyItem(3, "Smartphone", 2300);
		
		
		client1.getTotal();
		
		client2.getTotal();
	}
}