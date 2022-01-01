package project;

import java.util.Scanner;

public class addingDiscountAndFinish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ArreyIngredients = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina",
				"Piletina", "4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix",
				"Pecurke", "Kutija" };
		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		String[] RegCustNumbers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };

		Scanner s = new Scanner(System.in);
		String ingredient = "";
		double price = 0;
		int discount = 0;
		System.out.println("Izvolite !!");
		while (!ingredient.equals("Poruci")) {

			System.out.print("Izaberite sastojak za pastu: ");
			ingredient = s.nextLine();
			if (!ingredient.equals("Poruci")) {
				price = price + prices[ingredientIndex(ArreyIngredients, ingredient)];
			}

		}

		String phoneNumber = "";
		System.out.print("Unesite vas broj telefona: ");
		phoneNumber = s.next();
		if (regularCustomer(RegCustNumbers, phoneNumber)) {
			price = price - (price / 100 * 10);
			
		}
		System.out.println("Cena vase paste iznosi "+price+" rsd.");
		System.out.println("Prijatno!");
	}

	public static int ingredientIndex(String[] ArreyIngredients, String ingredient) {
		for (int i = 0; i < ArreyIngredients.length; i++) {
			if (ArreyIngredients[i].equals(ingredient)) {
				return i;
			}

		}
		return 0;
	}

	public static boolean regularCustomer(String[] RegCustNumbers, String phoneNumber) {
		for (int i = 0; i < RegCustNumbers.length; i++) {
			if (RegCustNumbers[i].equals(phoneNumber)) {
				return true;
			}
		}
		return false;
	}
}