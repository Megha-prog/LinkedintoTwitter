package com.demo.LinkedinMix;

import java.util.ArrayList;
import java.util.List;

import ShareTo.Share;
import ShareTo.SharePostAdapter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	UserBuilder userBuilder1 = new UserBuilder()
                .setName("Megha")
                .setCountry("India");
        User user1 = userBuilder1.getUser();

        String postText = "Welcome to IT Industry ......";

        initialiseFollowers(user1); //intialize followers
        
        System.out.println(user1+"\n"); //shows user info
        
        user1.post(postText); //posting on LinkedIn
        
        shareToMedia("twitter",postText);

    }

	

	private static void initialiseFollowers(User user) {
		
		
		List<Follower> followers = new ArrayList<Follower>();
        followers.add(new Follower("Megha"));
        followers.add(new Follower("Nishu"));
        followers.add(new Follower("Ankur"));
        followers.add(new Follower("Darshan"));

        for (Follower follower: followers) {
            user.follow(follower);
        }
    }
	private static void shareToMedia(String to,String post){
        Share share = new Share();
        SharePostAdapter media= new SharePostAdapter();
        share.setSharePost(media);
        share.posting(to,post);
	}
	 
}
