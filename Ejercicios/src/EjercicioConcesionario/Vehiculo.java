package EjercicioConcesionario;

public abstract class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int precio;
	private char combustible;
	protected boolean nuevo;
	
	public Vehiculo(String matricula, String marca, String modelo, String color, int precio, char combustible, boolean nuevo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.combustible = combustible;
		this.nuevo = nuevo;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getColor() {
		return this.color;
	}
	
	
	public String getDatos() {
		return this.getMatricula() + "\t" + this.getMarca() + " " + this.getModelo() + "\t" + this.getColor() + "\t" + this.getPrecio() + "\t" +  (int)(this.getPrecio() - this.getPrecio()*this.getDescuento()) + "\t" + this.getCombustible() + "\t" + ((this.getNuevo()) ? "Nuevo " : "Seminuevo");
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getCombustible() {
		String aux = "";
		if(this.combustible == 'D') {
			aux += "Diesel";
		}else if(this.combustible == 'E') {
			aux += "Electrico";
		}else if(this.combustible == 'G') {
			aux += "Gasolina";
		}else {
			aux += "Hibrido";
		}		
		return aux;
	
	}
	
	public boolean getNuevo() {
		return this.nuevo;
	}
	
	abstract public double getDescuento();
}
