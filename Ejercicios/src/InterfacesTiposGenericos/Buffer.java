package InterfacesTiposGenericos;


public class Buffer<T> implements IBuffer<T> {
	
	private int primero;
	private int ultimo;
	 private T [] datos;
	
	public Buffer(int tamaño) {
		this.datos = (T[]) new Object[tamaño];
		this.primero = 0;
		this.ultimo = tamaño - 1;
	}
	
	public boolean vacio() {
		if(sucesor(ultimo) == 0) {
			return true;
		}else {
			if(sucesor(ultimo + 1) == this.primero) {
				return false;
			}else {
				return true;
			}
		}
	}
	
	public int sucesor(int p) {
		return p + 1;
	}
	
	public void inicializa() {
		
	}
	
	public void inserta(T e) {
		if(!vacio()) {
			this.datos[ultimo + 1] = e;
		}
	}
	
	public int inicio() {
		return this.primero;
	}
	
	public int fin() {
		return this.ultimo;
	}
	
	public T elemento(int p) throws Exception {
		for(int i = 0; i < this.datos.length; i++) {
			if(i == p) {
				return this.datos[i];
			}
		}
		return null;
	 }
	
}
