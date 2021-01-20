package EjercicioCentreInvestigacionMVC;

public class Controlador {
	
	private CentroInvestigacion centro;
	private IVista vista;
	
	public Controlador(CentroInvestigacion centro, IVista vista) {
		this.centro = centro;
		this.vista = vista;
	}
	
	public void setWeb(String web) {
		this.centro.setWeb(web);
	}
	
	public void altaInvestigador(Investigador i) {
		this.centro.altaInvestigador(i);
	}
	
	public void actualizaVista() {
		this.vista.salida(this.centro.consultaInvestigadores());
	}
	
}
