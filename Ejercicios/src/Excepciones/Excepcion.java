package Excepciones;

public class Excepcion {

	public static void main(String[] args) {
		int suma = 0;
		
		for (int i=1; i<=150; i++)
			suma = suma + i;
		System.out.println("La sumatoria de 1 a 150 es " + suma);
		
		// si la i del for se declara byte, es un bucle infinito
		
		int [] v = new int[150];
		
		for (int i=1; i<150; i++){
			v[i] = i;
		}
		
		System.out.println("\nDatos del vector\n");
		
		for (int i=1; i<150; i++) {
			System.out.println("v[" + i + "} \t" + v[i]);
		}
		// si la variable i del for se declara byte, se produce
		// la excepción ArrayIndexOutOfBounds
		
		for (byte i=1; i<150; i++) {
			try {
				System.out.println("v[" + i + "} \t" + v[i]);
			} catch (Exception e) {
				System.out.println("¡v[" + i + "] no existe!"); 
				break;
			}
		}
	}
}