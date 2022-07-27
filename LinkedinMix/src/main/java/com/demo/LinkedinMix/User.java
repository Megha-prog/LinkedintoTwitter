package com.demo.LinkedinMix;

import java.util.ArrayList;
import java.util.List;

public class User implements LinkedinFeatures {
	public String name;
	public String country;
	
	
	List<Follower> followerList = new ArrayList<Follower>();
	
	
	public User(String name,String country) {
		this.name = name;
		this.country= country;
		
	}


	public void post(String msg) {
		// TODO Auto-generated method stub
		
		for(Follower follower:followerList) {
			follower.notification(this.name, msg);
		}
		
		
		
	}


	public void follow(Follower follower) {
		// TODO Auto-generated method stub
		
		followerList.add(follower);
		
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", country=" + country + ", followerList=" + followerList + "]";
	}


	




	
	
	

}
