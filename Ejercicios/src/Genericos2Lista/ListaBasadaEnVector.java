package Genericos2Lista;

public class ListaBasadaEnVector {

	public static void main(String[] args) {
		
		Lista<Integer> numeros = new Lista<Integer>();
		 
		numeros.insertaPrimero(2);
		numeros.insertaUltimo(4);
		numeros.insertaUltimo(6);
		numeros.insertaPrimero(0);
		
		System.out.println("Lista " + numeros.toString());

	}

}
