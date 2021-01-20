package EjercicioPatronAdapter;

public class ObjetoAntiguo implements IObjetoAntiguo{
	
	private String nombre;
	
	public ObjetoAntiguo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
