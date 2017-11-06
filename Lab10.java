import java.util.ArrayList;
import java.util.Scanner;

//@Joe Garza
//Program creates a list of data inputed by user to compare vehicles and option to buy and remove from inventory.

public class Lab10 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userCont = "y";
		String buy = "";
		ArrayList<newCar> carLists = new ArrayList<>();
		newCar newCars1 = new newCar("Cheverolet", "Corvette", 2017, 63283.22);
		carLists.add(newCars1);
		newCar newCars2 = new newCar("Ford", "Mustang GT", 2017, 35432.22);
		carLists.add(newCars2);
		newCar newCars3 = new newCar("Nissan", "GTR", 2017, 107500.22);
		carLists.add(newCars3);

		UsedCars usedCar1 = new UsedCars("Toyota", "Supra", 1995, 64999.00, 45632);
		carLists.add(usedCar1);
		UsedCars usedCar2 = new UsedCars("Mitsubishi", "Lancer Evolution", 2010, 26500.00, 78500);
		carLists.add(usedCar2);
		UsedCars usedCar3 = new UsedCars("Pontiac", "Trans Am", 2002, 14499.00, 104500);
		carLists.add(usedCar3);

		int i = 0;
		while (userCont.equalsIgnoreCase("y")) {
			for (i = 0; i < carLists.size(); i++) {

				System.out.print(i + 1 + ". ");
				System.out.println(carLists.get(i));
			}
			String quit = (carLists.size() + 1) + ". Quit";
			System.out.println(quit);
			int buyCar = 0;
			buyCar = Validator.getInt(scnr, "Which car would you like?");
			buyCar = buyCar - 1;
			if (buyCar == carLists.size()) {
				userCont = "n";
			} else {
				System.out.println(carLists.get(buyCar));

				System.out.println("Would you like to buy this car? y/n");
				buy = scnr.nextLine();

				if (buy.equalsIgnoreCase("y")) {
					carLists.remove(buyCar);
				}
				System.out.println("Great! Our finance departent will be in touch shortly. \n");

			}
			if (carLists.size() == 0) {
				System.out.println("That sucker bought all of our cars!");
				userCont = "n";
			}
		}
		System.out.println("Have a great day!");

	}
}
