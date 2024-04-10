package oo2_ej6;

import java.util.ArrayList;

public class TopografiaMixta extends Topografia{
	private ArrayList<Topografia> celdas = new ArrayList<Topografia>();
	
	public TopografiaMixta(Topografia arribaIzq, Topografia arribaDer, Topografia abajoIzq, Topografia abajoDer) {
		celdas.add(arribaIzq);
		celdas.add(arribaDer);
		celdas.add(abajoIzq);
		celdas.add(abajoDer);
	}
	
	public ArrayList<Topografia> getCeldas(){
		return celdas;
	}

	@Override
	public double proporcionAgua() {
		return celdas.stream().mapToDouble(celda-> celda.proporcionAgua()).average().orElse(0);
	}

	@Override
	public double proporcionTierra() {
		return celdas.stream().mapToDouble(celda-> celda.proporcionTierra()).average().orElse(0);
	}

	@Override
	public boolean comparar(TopografiaMixta t) {
		return celdas.equals(t.getCeldas());
	}

	@Override
	public boolean comparar(TopografiaTierra t) {
		return false;
	}

	@Override
	public boolean comparar(TopografiaAgua t) {
		return false;
	}

}
