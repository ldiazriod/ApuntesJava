package EjercicioEntidadBancaria;

import java.util.Vector;

public class Banco {

	private String web;
	private String entidad;
	private String nombre;
	private Vector<Cliente> clientes;
	private Vector<Cuenta> cuentas;
	
	public Banco(String web, String entidad, String nombre) {
		this.web = web;
		this.entidad = entidad;
		this.nombre = nombre;
		this.clientes = new Vector<Cliente>();
		this.cuentas = new Vector<Cuenta>();
	}
	
	public String getWeb() {
		return this.web;
	}
	
	public String getEntidad() {
		return this.entidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String consultaCuentas() {
		String s = this.getWeb() + "\t\t Todas las cuentas \n"; 
		for(Cuenta c: cuentas) {
			s += "\n" + c.getDatos();
		}
		s += "\n";
		return s;
	}
	
	public void altaCuenta(Cuenta c) {
		this.cuentas.add(c);
	}
	
	public void altaCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public void ingresoCuenta(String numero, float cantidad) {
		for(Cuenta c : cuentas) {
			if(c.getNumero().contentEquals(numero)) {
				c.ingreso(cantidad);
			}
		}
	}
	
	public void retiroCuenta(String numero, float cantidad) {
		for(Cuenta c : cuentas) {
			if(c.getNumero().contentEquals(numero)) {
				c.retiro(cantidad);
			}
		}
	}
}
