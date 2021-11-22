package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import models.User;

public class LoginDAO extends DAO {

	
	public LoginDAO() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User checkUser(String username, String password) throws SQLException {
		String sql = "SELECT * FROM tbluser WHERE username = ? and password = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, username);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		SimpleDateFormat sdf = new SimpleDateFormat();
		while (rs.next()) {
	
//			System.out.println(rs.getString("username") + " " + rs.getString("password"));
			int id = rs.getInt("id");
			String userna = rs.getString("username");
			String psw = rs.getString("password");
			String fullname = rs.getString("fullname");
			String dob =sdf.format(rs.getDate("dob"));
			String address = rs.getString("address");
			String email = rs.getString("email");
			int telephone = rs.getInt("telephone");
			String role = rs.getString("role");
//			String des = rs.getString("description");)
			return new User(id, userna, psw, fullname, dob, address, email, role, null, telephone);
		}
		return null;
	}

//	public static void main(String[] args) {
//		try {
//			LoginDAO dao = new LoginDAO();
//			System.out.println(dao.checkUser("ihak1510", "1"));
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	
}
