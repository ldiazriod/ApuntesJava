package EjercicioEmpresaConsultora;

import java.time.LocalDate;

public class Auxiliar extends Empleado {
	
	public Auxiliar(String nif, String nombre, String apellido, LocalDate fechaContratacion, double sueldo) {
		super(nif, nombre, apellido, fechaContratacion, sueldo);
	}
	
	public double getSubidaSalarial() {
		double factor = 0.035 + ((super.getAntiguedad() >= 3) ? 0.01 : 0.0);
		
		return (super.getSueldo() * factor);
	}
}
