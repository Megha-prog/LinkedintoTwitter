package ShareTo;

public class SharePostAdapter implements Media {
	
	
	ShareToFacebook fb = new ShareToFacebook();
	
	
	ShareToTwitter tt= new ShareToTwitter();


	public void share(String to, String msg) {
		// TODO Auto-generated method stub
			
			switch (to) {
			
			
			case "facebook" : fb.post(msg);break;
			case "twitter" : tt.post(msg);break;
			default:System.out.println(to + "not supported other media");
			}
			
		}

		
	}

	
	
	
	
	


