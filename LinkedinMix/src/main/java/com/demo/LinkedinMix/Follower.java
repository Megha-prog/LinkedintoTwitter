package com.demo.LinkedinMix;

public class Follower {
	
	private String name;
	 
	
	public Follower(String name) {
		super();
		// TODO Auto-generated constructor stub
		
		this.name=name;
	}
	
	
	
	public void notification(String name, String msg) {
		System.out.println("Hey"+ this.name + " ,"+ msg);
	}



	@Override
	public String toString() {
		return "Follower [name=" + name + "]";
	}

}
