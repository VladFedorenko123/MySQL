package src.srccode.mysql;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import src.srccode.interfaces.MySQLConnector;

public class MySQLConnecting implements MySQLConnector {

	@Override
	public Connection connectin() {
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			// String sqlCommand = "CREATE TABLE mytable (Id INT PRIMARY KEY AUTO_INCREMENT,
			// FirstName VARCHAR(20),LastName VARCHAR(20))";
			return DriverManager.getConnection("jdbc:mysql://localhost/mydatabase", "root", "password");
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}

	}

}
