package Food_Delivery_App;

public class Pizza extends Food{

	String toppings;
	String size;
	String cheese;



	public Pizza(String name, String category, double price, int quantity, String toppings, String size,
			String cheese) {
		super(name, category, price, quantity);
		this.toppings = toppings;
		this.size = size;
		this.cheese = cheese;
	}

	@Override
	public void showDetails() {
		System.out.println("Pizza Details: ");
		System.out.println("Toppings: "+ toppings);
		System.out.println("Pizza Size: "+ size);
		System.out.println("Cheese bust: "+ cheese);
		System.out.println("Price per Pizza: "+ price);
		System.out.println("Quantity: "+quantity);	
	}

	@Override
	public void cancelOrder() {
		if (this.quantity > 0) {
			super.cancelOrder();
		}else {
			System.out.println("Cannot cancel as no pizza is ordered");

		}
	}
	
	@Override
	public void placeOrder() {
		if (this.quantity > 0) {
			super.placeOrder();
		} else {
			System.out.println("Cannot place order as no pizza is ordeded");
		}
	}
}
