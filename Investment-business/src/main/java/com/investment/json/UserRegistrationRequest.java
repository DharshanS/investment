package com.investment.json;

public class UserRegistrationRequest {
	
	
	public UserRegistrationRequest(String name, String email, String passowrd, String category, String _class) {
	
		this.name = name;
		this.email = email;
		this.passowrd = passowrd;
		this.category = category;
		this._class = _class;
	}
	public UserRegistrationRequest(){}
	private String name ;
	private String email;
	private String passowrd;
	private String category;
	private String _class;
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
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}

}
