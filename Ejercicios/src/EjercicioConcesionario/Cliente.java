package EjercicioConcesionario;

public class Cliente {
	
	private String nif;
	private String nombre;
	private String apellidos;
	
	public Cliente(String nif, String nombre, String apellidos) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
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
		return this.getNIF() + "\t" + this.getApellidos() + ", " + this.getNombre();
	}
}
