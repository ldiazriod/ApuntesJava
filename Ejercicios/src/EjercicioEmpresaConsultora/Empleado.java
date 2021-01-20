package EjercicioEmpresaConsultora;

import java.time.LocalDate;
import java.text.DecimalFormat;

public abstract class Empleado {
	private String nif;
	private String nombre;
	private String apellidos;
	private LocalDate fechaContratacion;
	private double sueldo;
	
	public Empleado(String nif, String nombre, String apellidos, LocalDate fechaContratacion, double sueldo) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaContratacion = fechaContratacion;
		this.sueldo = sueldo;
	}
	
	public String getNIF() {
		return this.nif;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String getDatos() {
		DecimalFormat df = new DecimalFormat("#.##");
		return this.getNIF() + " " + this.getNombre() + " " + this.getApellidos() + " " + this.getFechaContratacion() + " " + this.getSueldo() + " " + Double.valueOf(df.format(this.getSubidaSalarial())) + " " + this.getClass().getSimpleName() + " ";
	}
	
	public LocalDate getFechaContratacion() {
		return this.fechaContratacion;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	abstract public double getSubidaSalarial();
	
	public int getAñoContratacion() {
		return this.fechaContratacion.getYear();
	}
	
	public int getAntiguedad() {
		int añoHoy = LocalDate.now().getYear();
		return añoHoy - this.fechaContratacion.getYear();
	}
}
