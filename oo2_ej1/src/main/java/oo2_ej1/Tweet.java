package oo2_ej1;

public class Tweet {
	private String posterScreenName;
	private String text;

	public Tweet(String screenName) {
		// TODO Auto-generated method stub
		this.posterScreenName = screenName;
	}
	
	public void setText(String t) {
		this.text = t;
	}
	
	public String getPosterScreenName() {
		return this.posterScreenName;
	}
	public String getText() {
		return this.text;
	}

}
