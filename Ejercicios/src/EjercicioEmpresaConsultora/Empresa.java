package EjercicioEmpresaConsultora;

import java.util.Vector;

public class Empresa {
	
	private String web;
	private Vector<Empleado> empleados;
	
	public Empresa(String web) {
		this.web = web;
		this.empleados = new Vector<Empleado>();
	}
	
	public String getWeb() {
		return this.web;
	}
	
	public void altaEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	public String consultaEmpleados() {
		String s = this.getWeb() + "\t\t Empleados \n";
		for(Empleado e : empleados) {
			s += "\n" + e.getDatos();
		}
		s += "\n";
		return s;
	}
	
	public String consultaEmpleados(String tipo) {
		String s = this.getWeb() + "\t\t" + tipo + "\n";
		for(Empleado e: empleados) {
			if(e.getClass().getSimpleName().equals(tipo)) {
				s += "\n" + e.getDatos();
			}
		}
		s += "\n";
		return s;
	}
	
	public String consultaEmpleados(double sMin, double sMax) {
		String s = this.getWeb() + "\t\t Sueldos entre " + sMin + " y " + sMax + "euros \n";
		for(Empleado e: empleados) {
			if((e.getSueldo() >= sMin) && (e.getSueldo() <= sMax)) {
				s += "\n" + e.getDatos();
			}
		}
		s += "\n";
		return s;
	}
}
