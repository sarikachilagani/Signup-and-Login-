package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Util {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	static final String USER_NAME = "root";
	static final String PASSWORD = "myroot@12345";


	public int execute(String insertQuery) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			Statement stmt = con.createStatement();
			return stmt.executeUpdate(insertQuery);
		} catch (Exception e) {
			System.out.println("Connection failed:" + e);
		}
		return 0;
	}
	
	public ResultSet executeSelect(String selectQuery) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			Statement stmt = con.createStatement();
			return stmt.executeQuery(selectQuery);
		} catch (Exception e) {
			System.out.println("Connection failed:" + e);
		}
		return null;
		
	}


}
