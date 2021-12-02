package com.dropboxclone.model;

public class User {
	//create basic pojo first. Add annotations later
	private int userid;
	private String username;
	private String password;
	private String email;
	private int phonenumber;
	
	public User() {
		super();
	}
	
	public User(int userid, String username, String password, String email, int phonenumber) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	
	public int getUserId() {
		return userid;
	}
	
	public void setUserId(int userid) {
		this.userid = userid;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPhoneNumber() {
		return phonenumber;
	}
	
	public void setPhoneNumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

}
