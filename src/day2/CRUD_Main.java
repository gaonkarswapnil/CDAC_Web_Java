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
	
	private static void showOneRestaurant() {
		// TODO Auto-generated method stub
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Restaurant rst = idao.getOne(3);
		if(rst!=null) {
			System.out.println(rst);
		}
		else {
			System.out.println("Restaurant with this ID does not exist");
		}
	}
	
	private static void createNewRestaurant() {
		// TODO Auto-generated method stub
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Restaurant res = new Restaurant("Karachi sweets","Local", 4, 23);
		idao.create(res);
	}
	
	private static void deleteRestaurant() {
		// TODO Auto-generated method stub
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		idao.delete(4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//showOneRestaurant();
		
		//createNewRestaurant();
		
		deleteRestaurant();
		
		showAllRestaurant();
	}

	

	

}
