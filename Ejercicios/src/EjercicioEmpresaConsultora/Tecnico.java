package EjercicioEmpresaConsultora;

import java.time.LocalDate;

public class Tecnico extends Empleado {
	
	public Tecnico(String nif, String nombre, String apellidos, LocalDate fechaContratacion, double sueldo) {
		super(nif, nombre, apellidos, fechaContratacion, sueldo);
	}
	
	public double getSubidaSalarial() {
		double factor = 0.025 + ((super.getAntiguedad() >= 3) ? 0.01 : 0.00);
		return (super.getSueldo() * factor);
	}
}
