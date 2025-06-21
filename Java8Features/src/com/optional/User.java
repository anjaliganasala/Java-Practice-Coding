package com.optional;

import java.util.Optional;

public class User {
	
	int userId;
	
	String email;
	
	public User(){
		
	}
	public User(int userId, String email) {
		super();
		this.userId=userId;
		this.email=email;
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + "]";
	}
	public Optional<String> getUserEmailById(int id) {
	    if (id == 10) {
	        return Optional.of(email);   // email must be non-null
	    } else {
	        return Optional.empty();     // valid empty Optional
	    }
	}
	}