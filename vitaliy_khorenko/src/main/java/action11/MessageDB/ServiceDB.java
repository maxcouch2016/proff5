package action11.MessageDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceDB {

	private static String nameDriver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/prof5";
	private static String login = "admin";
	private static String pass = "-MySqlAdmin123-";

	private static Connection getDBConnection() {
		Connection dbConnection = null;
		try {
			Class.forName(nameDriver);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			dbConnection = DriverManager.getConnection(url, login, pass);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}

	public static boolean insertRecordIntoTable(String table, String field, String message) throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		String insertTableSQL = "INSERT INTO " + table + " (" + field + ") VALUES ('" + message + "');";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println(insertTableSQL);
			statement.executeUpdate(insertTableSQL);
			System.out.println("Вставил!");
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	}

	public static List<String> selectAll(String table, String field) throws SQLException {
		Connection dbConnection = null;
		Statement statement = null;
		List<String> list = new ArrayList<>();

		String selectTableSQL = "select " + field + " from " + table + ";";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println(selectTableSQL);
			statement.executeQuery(selectTableSQL);
			System.out.println("Выбрал!");
			ResultSet rs = statement.executeQuery(selectTableSQL);
						
			while (rs.next()){
				list.add(rs.getString(1));
			}
			return list;
						
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}

	}

}
