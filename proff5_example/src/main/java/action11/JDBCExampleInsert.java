package action11;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExampleInsert {
 
	private static String nameDriver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/proff5";
	private static String login = "root";
	private static String pass = "root";

	public static void main(String[] args) {
		try {
			Class.forName(nameDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("insert into users ");
		sb.append("( `name`, `login`, `pass`, `employee_id`) values");
		sb.append("('userX', 'userX', '5', 0);");

		Connection connect = null;
		try {
			connect = DriverManager.getConnection(url, login, pass);
			Statement statement = connect.createStatement();
			int countChange = statement.executeUpdate(sb.toString());
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

