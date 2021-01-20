package Genericos1;

public class UsoInterfazTipoGenerico {

	public static void main(String[] args) {
		
		Integer [] numeros = { 9, 3, 7, 6, 2, 8, 5, 1, 4, 1 };
		Character [] vocales = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		 
		String [] palabras = { "Java", "clase", "objeto", "método" };
		 
		MinimoMaximo<Integer> n = new MinimoMaximo<Integer>(numeros);
		MinimoMaximo<Character> v = new MinimoMaximo<Character>(vocales);
		MinimoMaximo<String> p = new MinimoMaximo<String>(palabras);
		 
		System.out.println("Números min: " + n.min() + " \t max: " + n.max());
		System.out.println("Vocales min: " + v.min() + " \t max: " + v.max());
		System.out.println("Palabras min: " + p.min() + " \t max: " + p.max());


	}

}
