package org.blue.userdetails.model;

import java.io.Serializable;

public class LoginDetails implements Serializable {
	
	private static final long serialVersionUID = 7638862113017991332L;
	private Integer userId;
	private String firstName;
	private String lastName;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
