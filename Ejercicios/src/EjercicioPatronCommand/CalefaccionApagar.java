package EjercicioPatronCommand;

public class CalefaccionApagar implements Comando{
	
	private Calefaccion calefaccion;
	
	public CalefaccionApagar(Calefaccion calefaccion) {
		this.calefaccion = calefaccion;
	}
	
	public void ejecuta() {
		this.calefaccion.apagar();
	}
	
}
