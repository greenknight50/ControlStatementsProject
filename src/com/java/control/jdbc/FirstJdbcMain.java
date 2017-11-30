package com.java.control.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbcMain {

	public static void main(String[] args) {
		try {
			//Load driver
			Class.forName("com.mysql.jdbc.Driver");
			//Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/redmorphdb", "root", "123456");
			Statement stmt = con.createStatement();
			String sql = "select * from redmorphdb.ALLIANCE_DETAILS order by alliance_id";
			ResultSet resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				String name = resultSet.getString("alliance_name");
				System.out.println("name: " + name);
			}
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
