package Interfaces1;

public class BusquedaSimpleClavesChar {

	public static void main(String[] args) {
		
		String [] nombres = {"María", "Ana", "Laura", "Carlos"};
		Object [] claves = {'a', 'b', 'c', 'd', 'e'};
		
		BusquedaSimple b = new BusquedaSimple(nombres, claves);
		
		System.out.println("La clave de Ana es " + b.existe("Ana"));
		System.out.println("La clave de Laura es " + b.existe("Laura"));
	}

}
