package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection con = null;
	
	public DAO() {
		if(con == null){
			String dbUrl ="jdbc:mysql://localhost:3306/sad?autoReconnect=true&useSSL=false";
		
			String dbClass = "com.mysql.jdbc.Driver";
			try {
			Class.forName(dbClass);
			con = DriverManager.getConnection (dbUrl, "root",
			 "Khai15102@");
			}catch(Exception e) {
			e.printStackTrace();
			}
			}
	}
}
