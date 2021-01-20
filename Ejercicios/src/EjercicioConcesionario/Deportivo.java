package EjercicioConcesionario;

public class Deportivo extends Vehiculo {

	private int potencia;
	private char tipoMarcha;
	
	public Deportivo(String matricula, String marca, String modelo, String color, int precio, char combustible, boolean nuevo, int potencia, char tipoMarcha) {
		super(matricula, marca, modelo, color, precio, combustible, nuevo);
		this.potencia = potencia;
		this.tipoMarcha = tipoMarcha;
	}
	
	public int getPotencia() {
		return this.potencia;
	}
	
	public String getTipoMarcha() {
		return ((this.tipoMarcha == 'A') ? "Automatico" : "Manual");
	}
	
	public String getDatos() {
		return super.getDatos() + "\t" + this.getPotencia() + "\t" + this.getTipoMarcha();
	}
	
	public double getDescuento() {
		return ((super.getNuevo()) ? 0.00 : 0.002);
	}
}
