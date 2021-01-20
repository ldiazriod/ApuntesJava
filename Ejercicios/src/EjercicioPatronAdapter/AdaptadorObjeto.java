package EjercicioPatronAdapter;

public class AdaptadorObjeto implements IObjetoNuevo {
	
	private ObjetoAntiguo objeto;
	
	public AdaptadorObjeto(ObjetoAntiguo objeto) {
		this.objeto = objeto;
	}

	public String getNombre() {
		return this.objeto.getNombre().split(" ")[0];
	}
	
	public String getApellidos() {
		return this.objeto.getNombre().split(" ")[1];
	}
	
	
}
