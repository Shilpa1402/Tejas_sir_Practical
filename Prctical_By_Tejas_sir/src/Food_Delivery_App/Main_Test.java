package Food_Delivery_App;

public class Main_Test {

	public static void main(String[] args) {
		Food f1 = new Pizza("Cheese corn pizza", "Veg", 250.0, 3, "olives","Medium", "Yes");
		Food f2 = new Burger ("Maharaja Burger", "Veg", 65, 1, "Medium", "vegCrispy");
		Food f3 = new SoftDrinks("Frooti", "Soft Drink", 20, 6); 
		
		System.out.println("Testing Pizza Order:");
		f1.showDetails();
		f1.placeOrder();
		f1.cancelOrder();
		f1.placeOrder();
		f1.cancelOrder();
		
		System.out.println();
		
		System.out.println("Testing Burger Order:");
		f2.showDetails();
		f2.placeOrder();
		f2.cancelOrder();
		f2.placeOrder();
		
		System.out.println();
		
		System.out.println("Testing Soft Drink Order:");
		f3.showDetails();
		f3.placeOrder();
		f3.cancelOrder();
		f3.placeOrder();
		
	}

}
