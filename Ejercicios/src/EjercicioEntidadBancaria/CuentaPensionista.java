package EjercicioEntidadBancaria;

public class CuentaPensionista extends Cuenta {
	
	public CuentaPensionista(String numero, String nif) {
		super(numero, nif);
	}
	
	public CuentaPensionista(String numero, float saldo, String nif) {
		super(numero, saldo, nif);
	}
	
	public String getDatos() {
		return "Cuenta Pensionista: " + super.getDatos();
	}
	
	public void ingreso(float cantidad) {
		this.saldo += cantidad + (0.0075f * cantidad);
	}
}
