package oo2_ej1;

import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private ArrayList<Tweet> lista_tweets = new ArrayList<Tweet>();

	public Usuario(String screenName) {
		this.screenName = screenName;

	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public String nuevoTweet(String texto) {
		if (texto.length() < 1 ) {
			return "El texto tiene que tener por lo menos un caracter";
		} else if (texto.length() > 280 ) {
			return "El texto no puede tener mas de 280 caracteres";
		}
		Tweet newT = new Tweet(this.getScreenName());
		newT.setText(texto);
		lista_tweets.add(newT);
		return "Tweet agregado";
	}
	
	public void nuevoRetweet(Tweet t) {
		Retweet newRT = new Retweet(this.getScreenName());
		newRT.setTweet(newRT);
		lista_tweets.add(newRT);
	}

}
