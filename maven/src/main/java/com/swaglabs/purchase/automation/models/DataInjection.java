package com.swaglabs.purchase.automation.models;

public class DataInjection {
	
	private String username,
				   password,
				   firstName,
				   lastName,
				   zip;
	
	public DataInjection() {
		
		this.username = "standard_user";
		this.password = "secret_sauce";
		this.firstName = "Jhon";
		this.lastName = "Muñoz";
		this.zip= "123456789";
		
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getUsername() {
		return username;
	}
	public String getZip() {
		return zip;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}
	

}
