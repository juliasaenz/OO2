package oo2_ej4;

public class EmpleadoPlanta extends Empleado {
	private int antiguedad;
	private double precioAntiguedad = 2000;
	
	
	@Override
	public double adicional() {
		double adicional = this.antiguedad*this.precioAntiguedad + super.cantHijos*super.precioHijo;
		if (super.estadoCivil.equals("casado")) {
			adicional += super.precioCasado;
		}
		
		return adicional;
	}
	
	
}
