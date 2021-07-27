package src.srccode.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import src.srccode.interfaces.MySQLConnector;
import src.srccode.interfaces.UserDAO;

public class CreateUser implements UserDAO {
	MySQLConnector con = new MySQLConnecting();

	@Override
	public void createUser() {
		try {
			Statement statement = con.connectin().createStatement();
			// statement.executeUpdate(sqlCommand);
			Scanner scanner = new Scanner(System.in);

			System.out.println("Please enter your FirstName");
			String firstName = scanner.nextLine();

			System.out.println("Please enter your LastName");
			String lastName = scanner.nextLine();

			String sql = "INSERT INTO mytable (FirstName, LastName) VALUES (?,?)";

			PreparedStatement preparedStatement = con.connectin().prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			preparedStatement.executeUpdate();

			ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String surname = resultSet.getString(3);
				System.out.printf("id:%d %s %s\n", id, name, surname);
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
