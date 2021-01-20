package EjercicioObjetosIyII;

public class Alumno extends Persona {
	
	private String grado;
	
	public Alumno(String DNI, String nombre, String apellidos, String telefono, String grado ,int diaNacimiento, int mesNacimiento, int anoNacimiento) {
		super(DNI, nombre, apellidos, telefono, diaNacimiento, mesNacimiento, anoNacimiento);
		
		this.grado = grado;
	}
	
	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	public String getGrado() {
		return this.grado;
	}
	
	public String getDatos() {
		return super.getDatos() + ", Grado: " + this.grado;
	}
}
