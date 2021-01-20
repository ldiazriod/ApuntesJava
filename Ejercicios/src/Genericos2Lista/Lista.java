package Genericos2Lista;

import java.util.Vector;

public class Lista<T> {
	
	private Vector<T> lista;
	
	public Lista() {
		this.lista = new Vector<T>();
	}
	
	public boolean vacia() {
		return ((this.lista.isEmpty()) ? true : false);
	}
	
	public void insertaPrimero(T e) {
		this.lista.add(0, e);
	}
	
	public void insertaUltimo(T e) {
		this.lista.add(this.lista.size(), e);
	}
	
	public T eliminaPrimero() {
		if(!vacia()) {
			T e = this.lista.get(0);
			this.lista.removeElementAt(0);
			return e;
		}else {
			return null;
		}
	}
	
	public T eliminaUltimo() {
		if(!vacia()) {
			T e = this.lista.get(this.lista.size() - 1);
			this.lista.removeElementAt(this.lista.size() - 1);
			return e;
		}else {
			return null;
		}
	}
	
	
	public String toString() {
		String s = "{";
		
		for(T e : this.lista) {
			s += e + ", ";
		}
		
		s += "}";
		return s;
	}
}
