package Interfaces1;

public class BusquedaSimple implements IBusqueda{
	
	private String [] nombres;
	private Object [] claves;
	
	public BusquedaSimple(String [] nombres, Object [] claves) {
		this.nombres = nombres;
		this.claves = claves;
	}
	
	@Override
	public Object existe(String nombre) {
		for(int i = 0; i < this.nombres.length; i++) {
			if(nombres[i].contentEquals(nombre)) {
				return claves[i];
			}
		}
		return null;
	}
}
 