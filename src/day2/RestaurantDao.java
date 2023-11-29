package day2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class RestaurantDao implements DaoInterface<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> getAll() {
		// TODO Auto-generated method stub
		String sqlQuery = "select restaurantId, name, cuisine, branchCount from restaurant";
		Collection<Restaurant> allRestaurant = new ArrayList<>();
		
		try(
				Connection conn = JdbcUtils.buildConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);
				) {
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String cuisine = rs.getString(3);
				int branchCount = rs.getInt(4);
				
				Restaurant currentRestaurant = new Restaurant(name, cuisine, id, branchCount);
				allRestaurant.add(currentRestaurant);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allRestaurant;
	}

	@Override
	public Restaurant getOne(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

}
