package com.investment.json;

public class UserRegistrationResponse {
	public UserRegistrationResponse(String name, String email, String sessionId) {
		
		this.name = name;
		this.email = email;
		this.sessionId = sessionId;
	}
	public UserRegistrationResponse() {
	
	}
	private String name ;
	private String email;
	private String sessionId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}
