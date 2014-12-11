package edu.cmu.capstone.polaris.dbcon;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {
	
	protected DatabaseConnection(){}
	
	public static Connection getInstance() throws ClassNotFoundException, SQLException{
		if(conn == null){
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(connURL);
		}
		return conn;
	}
	
	private static final String user = "tony";
	private static final String password = "demo";
	private static final int defaultPort = 13306;
	private static final String database = "polaris";
	private static final String connURL = "jdbc:mysql://localhost/"+database
            + "?user="+user+"&password="+password;
	private static Connection conn = null;
	

	
	public static void main(String[] args){
		try {
			Connection conn = DatabaseConnection.getInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	
}
