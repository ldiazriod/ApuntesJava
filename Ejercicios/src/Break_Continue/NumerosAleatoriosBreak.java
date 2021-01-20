package Break_Continue;

public class NumerosAleatoriosBreak {

	public static void main(String[] args) {
		
		int c = 1;
		int numero;
		
		do {
			numero = (int)(1000 * Math.random());
			System.out.println("Número " + c++ + "\t" + numero);
			
			if(numero % 25 == 0) {
				break;
			}
		} while (c <= 100);
	}

}
