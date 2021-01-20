package EjercicioConcesionario;

import java.util.List;
import java.util.ArrayList;

public class Concesionario {
	
	private String cif;
	private String nombre;
	private String web;
	private List<Cliente>clientes;
	private List<Vehiculo> vehiculos;
	private List<VehiculoVendido> vehiculosVendidos;
	private List<Comentario> comentarios;
	
	public Concesionario(String cif, String nombre, String web) {
		this.cif = cif;
		this.nombre = nombre;
		this.web = web;
		this.clientes = new ArrayList<Cliente>();
		this.vehiculos = new ArrayList<Vehiculo>();
		this.vehiculosVendidos = new ArrayList<VehiculoVendido>();
		this.comentarios = new ArrayList<Comentario>();
	}
	
	public String getCIF() {
		return this.cif;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getWeb() {
		return this.web;
	}
	
	public Cliente getCliente(String nif) {
		for(Cliente p : clientes) {
			if(p.getNIF().contentEquals(nif)) {
				return p;
			}
		}
		return null;
	}
	
	public Vehiculo getVehiculo(String matricula) {
		for(Vehiculo v : vehiculos) {
			if(v.getMatricula().contentEquals(matricula)) {
				return v;
			}
		}
		return null;
	}
	
	public void altaCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void altaVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
	}
	
	public void altaComentario(Comentario comentario) {
		this.comentarios.add(comentario);
	}
	
	public void vendeVehiculo(String nif, String matricula) {
		for(Cliente p : clientes) {
			if(p.getNIF().contentEquals(nif)) {
				for(Vehiculo v : vehiculos) {
					if(v.getMatricula().contentEquals(matricula)) {
						VehiculoVendido vv = new VehiculoVendido(p, v);
						this.vehiculosVendidos.add(vv);
					}
				}
			}
		}
		
	}
	
	public String consultaClientes() {
		String s = this.getCIF() + "\t" + this.getNombre() + "\t\t Clientes \t\t" + this.getWeb() + "\n";
		for(Cliente c : clientes) {
			s += "\n" + c;
		}
		s += "\n";
		return s;
	}
	
	
	public String consultaComentariosClientes() {
		String s = this.getCIF() + "\t" + this.getNombre() + "\t\t Comentarios \t\t" + this.getWeb() + "\n";
		for(Comentario c : comentarios) {
			s += "\n" + c;
		}
		s += "\n";
		return s;
	}
	
	public String consultaVehiculos(String marca) {
		String s = this.getCIF() + "\t" + this.getNombre() + "\t\t Vehiculos de la marca " + marca  + "\t\t" + this.getWeb() + "\n";
		for(Vehiculo v : vehiculos) {
			if(v.getMarca().contentEquals(marca)) {
				s += "\n" + v;
			}
		}
		s += "\n";
		return s;
	}
	
	public String consultaVehiculos(String marca, double precioMinimo, double precioMaximo) {
		String s = this.getCIF() + "\t" + this.getNombre() + "\t\t Vehiculos de la marca " + marca  + "\t\t" + this.getWeb() + "\n";
		for(Vehiculo v : vehiculos) {
			if(((v.getPrecio() <= precioMaximo) && (v.getPrecio() >= precioMinimo)) && (v.getMarca().contentEquals(marca))) {
				s += "\n" + v;
			}
		}
		s += "\n";
		return s;
	}
	
	public String consultaVehiculos(String marca, String clase) {
		if(clase.isEmpty()) {
			return consultaVehiculos(marca);
		}else {
			String s = this.getCIF() + "\t" + this.getNombre() + "\t\t Vehiculos de la marca " + marca  + "\t\t" + this.getWeb() + "\n";
			for(Vehiculo v : vehiculos) {
				if((v.getMarca().contentEquals(marca)) && (v.getModelo().contentEquals(clase))) {
					s += "\n" + v;
				}
			}
			s += "\n";
			return s;
		}
	}
	
	
}
