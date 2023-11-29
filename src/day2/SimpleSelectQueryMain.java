package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driverClassName);
			System.out.println("Driver Loaded");
			
			String connectionUrl = "jdbc:mysql://localhost:3306/cdac_nov_23";
			String userId = "root";
			String password = "root";
			dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
			System.out.println("Connected to DB");
			stmt = dbConnection.createStatement();
			
			String sqlQuery = "select id, name, phone, email, cid from employee";
			rs = stmt.executeQuery(sqlQuery);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				long phone = rs.getLong(3);
				String email = rs.getString(4);
				int cid = rs.getInt(5);
				
				System.out.println(id+"\t"+name+"\t"+phone+"\t"+email+"\t"+cid);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
