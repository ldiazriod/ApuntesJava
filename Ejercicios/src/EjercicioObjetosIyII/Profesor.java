package EjercicioObjetosIyII;

public class Profesor extends Persona{
	
	private int anoTitulacion;
	
	public Profesor(String DNI, String nombre, String apellido, String telefono, int diaNacimiento, int mesNacimiento, int anoNacimiento, int anoTitulacion) {
		super(DNI, nombre, apellido, telefono, diaNacimiento, mesNacimiento, anoNacimiento);
		this.anoTitulacion = anoTitulacion;
	}
	
	public int getAnoTitulacion() {
		return this.anoTitulacion;
	}
	
	public String getDatos() {
		return super.getDatos() + ", Año titulacion: " + this.anoTitulacion;
	}

}
