package EjercicioConcesionario;

public class Comentario {
	
	private String texto;
	private int valoracion;
	
	public Comentario(String texto, int valoracion) {
		this.texto = texto;
		this.valoracion = valoracion;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public String getEstrellas() {
		return "Valoracion: " + this.getValoracion() + " Texto: " + this.getTexto();
	}
	
	public int getValoracion() {
		return this.valoracion;
	}
	
}
