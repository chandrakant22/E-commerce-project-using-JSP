package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDao {
	
	private String url="jdbc:mysql://localhost:3306/demodb";
	private String uname="root";
	private String pass="abc123";
	private Connection con;
	
	private Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		
		return con;
	}
	
}
