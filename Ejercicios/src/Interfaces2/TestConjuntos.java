package Interfaces2;

public class TestConjuntos {

	public static void main(String[] args) {
		
		ConjuntoHashSet c1 = new ConjuntoHashSet();
		ConjuntoTreeSet c2 = new ConjuntoTreeSet();
		
		c1.inserta("María");
		c1.inserta("Luis");
		c1.inserta("Daniel");
		c1.inserta("Carlos");
		
		c2.inserta("María");
		c2.inserta("Laura");
		c2.inserta("Luis");
		c2.inserta("Javier");
		
		String nombre = "María";
		
		System.out.println(nombre + " " + ((c1.contiene(nombre)) ? "está en c1" : "no está en c1"));
		System.out.println(nombre + " " + ((c2.contiene(nombre)) ? "está en c2" : "no está en c2"));
		
		c1.inicializa();
		
		System.out.println("El conjunto c1 " + (c1.vacio() ? "está vacío" : "no está vacío"));
		System.out.println("El conjunto c2 " + (c2.vacio() ? "está vacío" : "no está vacío"));
		
	}

}
