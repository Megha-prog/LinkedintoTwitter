package ShareTo;

public class Share {
	
	private Media media;

    public Media getSharePost() {
        return media;
    }

    public void setSharePost(Media media) {
        this.media = media;
    }
    public void posting(String to,String msg){
        media.share(to,msg);
    }

}
