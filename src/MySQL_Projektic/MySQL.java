package MySQL_Projektic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySQL {
	public static void main(String[] args) {
		// Trazimo od korisnika da unese grad za koji zeli da zna informacije
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the city: ");
		String city = input.nextLine();

		try {
			Connection connect = getConnection();
			Statement statement = connect.createStatement();
			// Uzimamo sve iz baze podataka i printamo grad broj populaciju
			ResultSet result = statement.executeQuery("SELECT * FROM city WHERE Name = '" + city + "'");
			result.next();
			System.out.println("City: " + result.getString("Name") + " ");
			System.out.println("CountryCode: " + result.getString("CountryCode") + " ");
			System.out.println("District: " + result.getString("District"));
			System.out.println("Population: " + result.getString("Population"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		input.close();
	}

	// Pravimo konekciju koristimo konektore i pravimo metodu preko koje cemo se
	// konektovati na bazu podataka
	public static Connection getConnection() {
		try {
			String user = "root";
			String pass = "hasan";
			String url = "jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false";
			Connection connect = DriverManager.getConnection(url, user, pass);
			return connect;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
