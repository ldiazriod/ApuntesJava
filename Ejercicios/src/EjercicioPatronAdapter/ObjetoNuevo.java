package EjercicioPatronAdapter;

public class ObjetoNuevo implements IObjetoNuevo{
	
	private String nombre;
	private String apellidos;
	
	public ObjetoNuevo(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
}
