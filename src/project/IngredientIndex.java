package project;

import java.util.Scanner;

public class IngredientIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ArreyIngredients = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina",
				"Piletina", "4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix",
				"Pecurke", "Kutija" };
		Scanner s=new Scanner (System.in);
		System.out.println("Izvolite !!");
		System.out.print("Izaberite sastojak za pastu: ");
		String ingredient=s.next();
		System.out.println(ingredientIndex(ArreyIngredients, ingredient));
	}

	public static int ingredientIndex(String[] ArreyIngredients, String ingredient) {
		for (int i = 0; i < ArreyIngredients.length; i++) {
			if (ArreyIngredients[i].equals(ingredient)) {
				return i;
			}

		}
		return 0;
	}
}