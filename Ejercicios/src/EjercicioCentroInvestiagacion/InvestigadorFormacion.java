package EjercicioCentroInvestiagacion;

import java.time.LocalDate;

public class InvestigadorFormacion extends Investigador{
	
	private boolean extraordinario;
	
	public InvestigadorFormacion(String nif, String nombre, String apellidos, LocalDate fechaContratacion, double retribucion, boolean extraordinario) {
		super(nif, nombre, apellidos, fechaContratacion, retribucion);
		this.extraordinario = extraordinario;
	}
	
	public boolean getExtraordinario() {
		return this.extraordinario;
	}
	
	public double getSubidaSalarial() {
		double factor = 0.025 + ((this.getExtraordinario() == true) ? 0.01 : 0.00) + ((super.getAntiguedad() >= 3) ? 0.01 : 0.00);
		return (super.getRetribucion() * factor);
	}
	
	public String getDatos() {
		return super.getDatos() + " " + this.getExtraordinario();
	}
	
}
