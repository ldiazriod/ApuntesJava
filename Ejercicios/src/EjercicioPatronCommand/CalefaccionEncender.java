package EjercicioPatronCommand;

public class CalefaccionEncender implements Comando {
	private Calefaccion calefaccion;
	 
	public CalefaccionEncender(Calefaccion calefaccion) {
		this.calefaccion = calefaccion;
	}
	
	public void ejecuta() {
		this.calefaccion.encender();
	}

}
