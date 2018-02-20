package package2;

public class Restaurant {
	
	// Zokusei: Fields
	private String restaurantName;

	// Initialization
	//private String restaurantName = null;
	private String location;
	
	public String typeOfRestaurant;
	
	private int numberofEmployee;
	

	
	// Functions / Methods
	public void merge() {
		
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String x) {
		
		if (x.length() > 10) {
			return;
		}
		
		this.restaurantName = x;
		
	}

	public int getNumberofEmployee() {
		return numberofEmployee;
	}

	public void setNumberofEmployee(int numberofEmployee) {
		this.numberofEmployee = numberofEmployee;
	}
	

}
