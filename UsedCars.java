
public class UsedCars extends newCar {

	//@Joe Garza
	//Program creates a list of data inputed by user to compare vehicles and option to buy and remove from inventory.

double mileage;

	
	public UsedCars() {
		
	}

	public UsedCars(String cars, String carsModel, int year, double price, double mileage) {
		super(cars, carsModel,year, price);
		this.mileage = mileage;
	}


	@Override
	public String toString() {
		
		return super.toString() + String.format("%-13s", "Miles " +mileage);
	}
	
	
}
