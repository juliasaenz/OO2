package oo2_ej4;

public class EmpleadoPasante extends Empleado {
	private int cantExam;
	private double precioExam = 2000;
	
	
	@Override
	public double adicional() {
		return this.cantExam * this.precioExam;
	}
	
	
}
