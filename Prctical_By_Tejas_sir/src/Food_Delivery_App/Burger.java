package Food_Delivery_App;

public class Burger extends Food {

	String size;
	String vegCrispy;
	String nonCrispy;
	public Burger(String name, String category, double price, int quantity, String size, String vegCrispy) {
		super(name, category, price, quantity);
		this.size = size;
		this.vegCrispy = vegCrispy;	
	}
	@Override
	public void showDetails() {
		System.out.println("Burger Details: ");
		System.out.println("Burger Size: "+ size);
		System.out.println("vegCrispy Burger: "+ vegCrispy);
		System.out.println("Price per Burger: "+ price);
		System.out.println("Quantity: "+quantity);	
	}
	@Override
	public void cancelOrder() {
		if (this.quantity > 0) {
			super.cancelOrder();
		}else {
			System.out.println("Cannot cancel as no Burger is ordered");
		}
	}
	@Override
	public void placeOrder() {
		if (this.quantity > 0) {
			super.placeOrder();
		} else {
			System.out.println("Cannot place order as no Burger is ordeded");
		}
	}
	}
