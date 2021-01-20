package EjercicioConcesionario;

public class Monovolumen extends Vehiculo{
	
	private int plazas;
	
	public Monovolumen(String matricula, String marca, String modelo, String color, int precio, char combustible, boolean nuevo, int plazas) {
		super(matricula, marca, modelo, color, precio, combustible, nuevo);
		this.plazas = plazas;
	}
	
	public int getPlazas() {
		return this.plazas;
	}
	
	public double getDescuento() {
		return ((super.getNuevo()) ? 0.0015 : 0.003);
	}
	
	public String getDatos() {
		return super.getDatos() + "\t" + this.getPlazas();
	}
}
