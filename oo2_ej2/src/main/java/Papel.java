
public class Papel extends Jugada {
	
	public String jugarContra(Tijera tijera) {
		return "Perdi";
	}

	@Override
	public String jugarContra(Piedra piedra) {
		// TODO Auto-generated method stub
		return "Gane";
	}

	@Override
	public String jugarContra(Papel papel) {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String jugarContra(Lagarto largarto) {
		// TODO Auto-generated method stub
		return "Perdi";
	}

	@Override
	public String jugarContra(Spock spock) {
		// TODO Auto-generated method stub
		return "Gane";
	}

}
