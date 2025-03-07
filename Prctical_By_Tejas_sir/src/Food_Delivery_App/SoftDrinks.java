package Food_Delivery_App;

public class SoftDrinks extends Food {
	String type;
	public SoftDrinks(String name, String category, double price, int quantity) {
		super(name, category, price, quantity);
		
	}
	@Override
	public void showDetails() {
		System.out.println("SoftDrinks Details: ");
		System.out.println("Type: "+ type);
		System.out.println("Price per Drink: "+ price);
		System.out.println("Quantity: "+quantity);	
	}
	
	@Override
	public void cancelOrder() {
		if (this.quantity > 0) {
			super.cancelOrder();
		}else {
			System.out.println("Cannot cancel as no Drink is ordered");
		}
	}
	
	@Override
	public void placeOrder() {
		if (this.quantity > 0) {
			super.placeOrder();
		} else {
			System.out.println("Cannot place order as no Drink is ordeded");
		}
	}
}
