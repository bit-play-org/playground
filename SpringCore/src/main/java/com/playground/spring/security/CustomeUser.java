package com.playground.spring.security;



public class CustomeUser {
	String userName;
	String password;
	String[] roles;
	
	
	public CustomeUser(String userName, String password, String... roles) {
		super();
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", roles=" + roles + "]";
	}
	
}
