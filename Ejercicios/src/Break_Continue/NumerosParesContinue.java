package Break_Continue;

public class NumerosParesContinue {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue; //Si el n�mero es impar finaliza la itraci�on
			}
			System.out.println("N�meros pares: " + i);
		}

	}

}
