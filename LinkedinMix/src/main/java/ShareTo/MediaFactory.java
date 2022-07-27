package ShareTo;

public class MediaFactory {
	public Media getSocialMedia(String media){
        switch(media){
            case "facebook" : {
                return new ShareToFacebook();
            }
            case "twitter" : {
                return new ShareToTwitter();
            }

            default: return new Notify();
        }
    }

}
