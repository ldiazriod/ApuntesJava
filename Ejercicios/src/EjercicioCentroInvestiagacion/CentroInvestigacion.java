package EjercicioCentroInvestiagacion;

import java.util.Vector;

public class CentroInvestigacion {
	
	private String web;
	private Vector<Investigador> investigadores;
	
	public CentroInvestigacion(String web) {
		this.web = web;
		this.investigadores = new Vector<Investigador>();
	}
	
	public String getWeb() {
		return this.web;
	}
	
	public void altaInvestigador(Investigador i) {
		this.investigadores.addElement(i);
	}
	
	public String consultaInvestigadores() {
		String s = this.getWeb() + "\t\t Investigadores \n";
		for (Investigador i : this.investigadores) {
			s = s + "\n" + i.getDatos();
		}
		s = s + "\n";
		return s;
	}
}
