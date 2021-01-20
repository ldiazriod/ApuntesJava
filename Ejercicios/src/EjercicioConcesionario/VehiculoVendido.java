package EjercicioConcesionario;

import java.time.LocalDate;

public class VehiculoVendido {
	private Cliente cliente;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	
	public VehiculoVendido(Cliente cliente, Vehiculo vehiculo) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}
	
	public String getFecha() {
		return this.fecha.getDayOfMonth() + "/" + this.fecha.getMonth() + "/" + this.fecha.getYear();
	}
}
