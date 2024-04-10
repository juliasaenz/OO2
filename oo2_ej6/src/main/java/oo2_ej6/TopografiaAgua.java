package oo2_ej6;

public class TopografiaAgua extends Topografia{

	@Override
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public double proporcionTierra() {
		return 0;
	}

	@Override
	public boolean comparar(TopografiaAgua t) {
		return true;
	}

	@Override
	public boolean comparar(TopografiaTierra t) {
		return false;
	}

	@Override
	public boolean comparar(TopografiaMixta t) {
		return false;
	}

}
