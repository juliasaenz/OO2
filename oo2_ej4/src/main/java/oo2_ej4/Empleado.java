package oo2_ej4;

public abstract class Empleado {
	protected String estadoCivil;
	protected int cantHijos;
	protected int sueldoBasico;
	
	protected double precioCasado = 3000;
	protected double precioHijo = 2000;
	
	public double basico() {
		return this.sueldoBasico;
	}
	
	public abstract double adicional();
	
	public double descuento() {
		return (13 / 100) * this.basico() + (5 / 100) * this.adicional();
	}
	
	public double sueldo() {
		return this.basico() + this.adicional() - this.descuento();
	}
}
