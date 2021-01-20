package EjercicioPatronCommand;

public class Calefaccion {
	
	private String tipo;
	
	public Calefaccion(String tipo) {
		this.tipo = tipo;
	}
	
	public void encender() {
		System.out.println("Encendiendo la calefacción " + this.tipo);
	}
	
	public void apagar() {
		System.out.println("Apagando la calefacción " + this.tipo);
	}
	
}
