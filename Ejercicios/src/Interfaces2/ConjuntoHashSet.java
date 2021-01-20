package Interfaces2;

import java.util.HashSet;

public class ConjuntoHashSet implements IConjunto {
	
	private HashSet<String> conjunto;
	
	public ConjuntoHashSet() {
		this.conjunto = new HashSet<String>();
	}
	
	public boolean vacio() {
		return this.conjunto.isEmpty();
	}
	
	public boolean contiene(String clave) {
		return this.conjunto.contains(clave);
	}
	
	public void inicializa() {
		this.conjunto.clear();
	}
	
	public void inserta(String clave) {
		this.conjunto.add(clave);
	}

}
