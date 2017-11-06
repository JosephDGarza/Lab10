import java.util.ArrayList;

//@Joe Garza
//Program creates a list of data inputed by user to compare vehicles and option to buy and remove from inventory.

public class newCar {

	private String cars;
	private String carsModel;
	private int year;
	private double price;
	public static String quit = "Quit";
	
	
	
	
	public newCar() {
		
	}
	public newCar(String cars, String carsModel, int year, double price) { // overloaded constructor
		this.cars = cars;
		this.carsModel = carsModel;
		this.year = year;
		this.price = price;
	}
	
	
	@Override 
	public String toString() {
/*		return System.out.printf("%-10s %-10s %-10s %-10s", cars, carsModel, year, price);
*/	
 		return String.format("%-20s %-20s %-10s %-15s", cars, carsModel, year, "$" + price);

}
}
