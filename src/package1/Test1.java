package package1;

import package2.Restaurant;


public class Test1 {

	public static void main(String[] args) {
		
		
		
		/////
		Restaurant res1 = new Restaurant();

		System.out.println("Restaurant Name: " + res1.getRestaurantName());
		res1.setRestaurantName("Jonathan");
		//res1.typeOfRestaurant = "Chinese";
		System.out.println("Restaurant Name: " + res1.getRestaurantName());
		res1.setNumberofEmployee(5);
		System.out.println("Number of Employees: " + res1.getNumberofEmployee());
	   
//		Restaurant res2 = new Restaurant();
//		res2.setRestaurantName("Dennys");
		
//		for (int i = 10; i > 0; i--) {			
//			System.out.println("Restaurant Name: " + res1.getRestaurantName());
//		}
//		System.out.println("Got out of for loop.");
		
		int j = 1;
		while (true) {
			System.out.println("j = " + j);
			System.out.println("Restaurant Name: " + res1.getRestaurantName());
			//j += 1;
			//j++;
			//j = j+1;
		}
		//System.out.println("Got out of while loop.");
	}

}
