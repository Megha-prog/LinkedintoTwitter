package com.demo.LinkedinMix;

public class UserBuilder {
	
	public String name;
	
	
	public String country;
	
	
	public UserBuilder setName(String name) {
		this.name=name;
		return this;
	}
	public UserBuilder setCountry(String country) {
		this.country=country;
		return this;
	}
	
	public User getUser() {
		return new User(name,country);
	}

}
