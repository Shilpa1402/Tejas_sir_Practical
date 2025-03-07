package Food_Delivery_App;

abstract class Food {
	String name; 
	String category;
	double price;
	int quantity;
	public Food(String name, String category, double price, int quantity) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double calculatePrice() {
		return price * quantity;
	}

	public double totalBill() {
		return calculatePrice();
	}
	public void placeOrder() {
		System.out.println("Orderis being placed...");
	}
		public void cancelOrder() {
			System.out.println("Order is cancelled...");
		}
		public abstract void showDetails();
	}

