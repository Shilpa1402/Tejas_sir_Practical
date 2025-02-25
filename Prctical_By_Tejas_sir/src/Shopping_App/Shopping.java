package Shopping_App;

public class Shopping {
	public double electricalTotal(double e1, double e2) {
		double allele = (e1 + e2) * 115 / 100;
		return  allele;
	}
	public double foodTotal(double f1, double f2) {
		double foodTotal = (f1 + f2) * 108 / 100;
		return  foodTotal;
	}

	public double clothingTotal(double c1) {
		double allCloth = c1 * 118 / 100;
		return allCloth;
	}
		public double totalBill(double ele, double food, double cloth) {
			double TotalBill = (ele + food + cloth);
			return TotalBill;
		}

		public void discountedBill(int ele1, int ele2, int food1, int food2, int cloth1) {
			double ele = electricalTotal(ele1, ele2);
			double food = foodTotal(food1, food2);
			double cloth = clothingTotal(cloth1);
			double total = totalBill(ele, food, cloth);
			double gstbill = total * 20 / 100;
			double finalBill = total - gstbill;

			System.out.println("Total Bill: " + total);
			System.out.println("Discount: " + gstbill);
			System.out.println("Final Bill: " + finalBill);
		}
	}
