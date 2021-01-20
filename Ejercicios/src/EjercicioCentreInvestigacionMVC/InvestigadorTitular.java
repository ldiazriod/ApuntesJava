package EjercicioCentreInvestigacionMVC;

import java.time.LocalDate;

public class InvestigadorTitular extends Investigador {
	
	private int sexenios;
	
	public InvestigadorTitular(String nif, String nombre, String apellidos, LocalDate fechaContratacion, double retribucion, int sexenios) {
		super(nif, nombre, apellidos, fechaContratacion, retribucion);
		this.sexenios = sexenios;
	}
	
	public int getSexenios() {
		return this.sexenios;
	}
	
	public double getSubidaSalarial() {
		double factor = 0.035 + this.getSexenios()/100.0 + ((super.getAntiguedad() >= 5) ? 0.01 : 0.0);
		return (super.getRetribucion() * factor);
	}
	
	public String getDatos() {
		return super.getDatos() + " " + this.getSexenios();
	}
	
}