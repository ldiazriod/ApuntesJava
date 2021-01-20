package EjercicioEntidadBancaria;

public class CuentaJoven extends Cuenta {
	
	public CuentaJoven(String numero, String nif) {
		super(numero, nif);
	}
	
	public CuentaJoven(String numero, float saldo, String nif) {
		super(numero, saldo ,nif);
	}
	
	public String getDatos() {
		return "Cuenta Joven: " + super.getDatos();
	}
	
	public void ingreso(float cantidad) {
		this.saldo += cantidad + (0.001f * cantidad); 
	}
	
}
