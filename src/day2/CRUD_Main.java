package day2;

import java.util.Collection;

public class CRUD_Main {
	private static void showAllRestaurant() {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Collection<Restaurant> allAvailableRestaurant = idao.getAll();
		for(Restaurant res: allAvailableRestaurant) {
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showAllRestaurant();
	}

}
