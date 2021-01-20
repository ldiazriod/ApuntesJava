package EjercicioEntidadBancaria;

public abstract class Cuenta {
	private String numero;
	private String nif;
	protected float saldo;
	
	public Cuenta(String numero, String nif) {
		this.numero = numero;
		this.nif = nif;
		this.saldo = 0.0f;
	}
	
	public Cuenta(String numero, float saldo, String nif) {
		this.numero = numero;
		this.nif = nif;
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public String getNIF() {
		return this.nif;
	}
	
	public String getDatos() {
		return "Numero: " + this.getNumero() + " Saldo: " + this.getSaldo() + " NIF: " + this.getNIF();
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void retiro(float cantidad) {
		this.saldo += this.saldo - cantidad;
	}
	
	abstract public void ingreso(float cantidad);
}
