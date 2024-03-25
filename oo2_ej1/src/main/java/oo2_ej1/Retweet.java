package oo2_ej1;

public class Retweet extends Tweet{
	private Tweet originalTweet;
	
	public Retweet(String screenName) {
		super(screenName);
		this.setText("");
	}
	
	public void setTweet(Tweet t) {
		this.originalTweet = t;
	}
	
	public Tweet getTweet(Tweet t) {
		return this.originalTweet;
	}
	
	public String getOriginalPosterScreenName() {
		return this.originalTweet.getPosterScreenName();
	}

}
