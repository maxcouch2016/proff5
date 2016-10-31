package chat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLconection {
	private static final String nameDriver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/chat";
	private static final String login = "root";
	private static final String pass = "root";

	public static void main(String[] args) {
		try {
			Class.forName(nameDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("INSERT INTO massage (user_id, massage) VALUES");
		sb.append("('" + 1 + "', '" + "massage" +"');");

		String query = sb.toString();
		Connection connect = null;
		try {
			connect = DriverManager.getConnection(url, login, pass);
			Statement statement = connect.createStatement();
			int countChange = statement.executeUpdate(query);
			System.out.println("countChange="+countChange);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connect != null)
				try {
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
