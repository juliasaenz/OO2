package oo2_ej4;

public class EmpleadoTemporario extends Empleado {
	private int cantHoras;
	private int precioHora = 300;
	
	
	@Override
	public double basico() {
		return super.sueldoBasico + this.cantHoras * this.precioHora;
	}
	
	@Override
	public double adicional() {
		// TODO Auto-generated method stub
		double adicional = 0 + super.cantHijos*super.precioHijo;
		if (super.estadoCivil.equals("casado")) {
			adicional += super.precioCasado;
		};
		return adicional;
	}
	
	
}
