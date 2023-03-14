package com.hdfc.jdbc.crud.dao;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DButil{
	public static Connection getcon() {
		Connection conn = null;
		try {
			FileReader fr = new FileReader("src/main/resources/application.properties");

			Properties prop = new Properties();

			prop.load(fr);

			String driver = prop.getProperty("driver.classname");

			
			String url = prop.getProperty("url");
			String username = prop.getProperty("user");
			String password = prop.getProperty("pwd");
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
}
}
