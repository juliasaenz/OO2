package oo2_ej1;

import java.util.ArrayList;

public class Twitter {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public String addUsuario(String screenName) {
		boolean existe = usuarios.stream().anyMatch(usuario -> usuario.getScreenName().equals(screenName));
		if(existe) {
			return "Este nombre de usuario ya existe";
		}
		usuarios.add(new Usuario(screenName));
		return "Se agrego el usuario yupi";
	}
	
	public String removeUsuario(String screenName) {
		Usuario user = usuarios.stream().filter(usuario -> usuario.getScreenName().equals(screenName)).findFirst().orElse(null);
		if (user.equals(null)) {
			return "No existe un usuario con ese screenName";
		}
		usuarios.remove(user);
		return "Se elimino el usuario";
	}
}