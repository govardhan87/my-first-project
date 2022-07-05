package databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstProject {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dburl = "jdbc:mysql://localhost:3306/Laptops";
		String username = "root";
		String password = "root";
		String query = "Select * from Laptops;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Brand: " + rs.getString("brand") + "\t");
			System.out.print("Model: " + rs.getString("model") + "\t");
			System.out.print("Price: " + rs.getString("price") + "\t");
			System.out.println();
		}
	}

}


