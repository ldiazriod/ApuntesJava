package Interfaces2;

import java.util.TreeSet;

public class ConjuntoTreeSet implements IConjunto {
	
	private TreeSet<String> conjunto;
	
	public ConjuntoTreeSet() {
		this.conjunto = new TreeSet<String>();
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
