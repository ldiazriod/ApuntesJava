package EjercicioConcesionario;


public class Turismo extends Vehiculo {
	
	private int puertas;
	
	public Turismo(String matricula, String marca, String modelo, String color, int precio, char combustible, boolean nuevo, int puertas ) {
		super(matricula, marca, modelo, color, precio, combustible, nuevo);
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	public double getDescuento() {
		double descuento;
		if(super.getNuevo()) {
			descuento = 0.0;
		}else {
			descuento = ((this.getPuertas() == 2) ? 0.001 : 0.0025);
		}
		return descuento;
	}
	
	public String getDatos() {
		return super.getDatos() + "\t" + this.getPuertas();
	}
}
