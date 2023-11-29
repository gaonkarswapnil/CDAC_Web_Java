package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverClassName);
			System.out.println("Driver Loaded");
			
			String connectionUrl = "jdbc:mysql://localhost:3306/cdac_nov_23";
			String userId = "root";
			String password = "root";
			
			Connection dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
			
			System.out.println("Connected to DB");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
