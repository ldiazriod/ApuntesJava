package Interfaces2;

public class TestConjuntos {

	public static void main(String[] args) {
		
		ConjuntoHashSet c1 = new ConjuntoHashSet();
		ConjuntoTreeSet c2 = new ConjuntoTreeSet();
		
		c1.inserta("Mar�a");
		c1.inserta("Luis");
		c1.inserta("Daniel");
		c1.inserta("Carlos");
		
		c2.inserta("Mar�a");
		c2.inserta("Laura");
		c2.inserta("Luis");
		c2.inserta("Javier");
		
		String nombre = "Mar�a";
		
		System.out.println(nombre + " " + ((c1.contiene(nombre)) ? "est� en c1" : "no est� en c1"));
		System.out.println(nombre + " " + ((c2.contiene(nombre)) ? "est� en c2" : "no est� en c2"));
		
		c1.inicializa();
		
		System.out.println("El conjunto c1 " + (c1.vacio() ? "est� vac�o" : "no est� vac�o"));
		System.out.println("El conjunto c2 " + (c2.vacio() ? "est� vac�o" : "no est� vac�o"));
		
	}

}
