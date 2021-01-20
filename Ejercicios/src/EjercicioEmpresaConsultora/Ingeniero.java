package EjercicioEmpresaConsultora;

import java.time.LocalDate;

public class Ingeniero extends Empleado {
	
	private boolean bilingue;
	
	public Ingeniero(String nif, String nombre, String apellido, LocalDate fechaContratacion, double sueldo, boolean bilingue) {
		super(nif, nombre, apellido, fechaContratacion, sueldo);
		this.bilingue = bilingue;
	}
	
	public boolean getBilingue() {
		return this.bilingue;
	}
	
	public double getSubidaSalarial() {
		double factor = 0.015 + ((super.getAntiguedad() >= 5) ? 0.0025 : 0.00) + ((this.bilingue = true) ? 0.005 : 0.00);
		
		return (super.getSueldo() * factor);
	}
	
	public String getDatos() {
		return super.getDatos() + " " + this.bilingue;
	}
	
}
