package EjercicioEntidadBancaria;

public class Cliente {
	private String nif;
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Cliente(String nif, String nombre, String apellido, String telefono) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	
	public String getNIF() {
		return this.nif;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellido;
	}
	
	public String getDatos() {
		return "Nombre: " + this.getNombre() + " Apellidos: " + this.getApellidos() + " NIF: " + this.getNIF() + " Telefono: " + this.getTelefono();
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
