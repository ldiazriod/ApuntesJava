package EjercicioPatronCommand;

public class MandoDistancia {
	
	private Comando comando;
	
	public MandoDistancia() {}
	
	public void comando(Comando comando) {
		this.comando = comando;
	}
	
	public void ejecuta() {
		this.comando.ejecuta();
	}
	
}
