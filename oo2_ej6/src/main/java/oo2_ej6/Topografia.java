package oo2_ej6;

public abstract class Topografia {
	
	public abstract double proporcionAgua();
	public abstract double proporcionTierra();
	public abstract boolean comparar(TopografiaAgua t);
	public abstract boolean comparar(TopografiaTierra t);
	public abstract boolean comparar(TopografiaMixta t);
}
