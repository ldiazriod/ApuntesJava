package EjercicioEntidadBancaria;

public class CuentaProfesional extends Cuenta {
	
	public CuentaProfesional(String numero, String nif) {
		super(numero, nif);
	}
	
	public CuentaProfesional(String numero, float saldo, String nif) {
		super(numero, saldo, nif);
	}
	
	public String getDatos() {
		return "Cuenta Profesional: " + super.getDatos();
	}
	
	public void ingreso(float cantidad) {
		this.saldo += cantidad;
	}
	
}
