package models;

import java.io.Serializable;

public class User implements Serializable {
	private String username, password, fullname, dob, address, email, role, description = null;
	private int id, phoneNumber;
	
	public User() {};
	
	public User(int id,String username, String password, String fullname, String dob, String address, String email,String role, String description, int phoneNumber) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.role = role;
		this.description = description;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
