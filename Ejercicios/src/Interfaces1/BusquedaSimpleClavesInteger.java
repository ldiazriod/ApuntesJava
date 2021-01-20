package Interfaces1;

public class BusquedaSimpleClavesInteger {

	public static void main(String[] args) {
		
		String [] nombres = {"María", "Ana", "Laura", "Carlos"};
		Object [] claves = {10, 20, 30, 40};
		
		BusquedaSimple b = new BusquedaSimple(nombres, claves);
		
		System.out.println("La clave de Ana es " + b.existe("Ana"));
		System.out.println("La clave de Laura es " + b.existe("Laura"));
		
	}

}
