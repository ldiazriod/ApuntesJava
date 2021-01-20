import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//-------------------Ejercicio1----------------------
		Scanner scanner = new Scanner(System.in);
		System.out.print("Meta un numero: ");
		double a = scanner.nextDouble();
		System.out.print("Meta otro numero: ");
		double b = scanner.nextDouble();
		
		Ejercicio1_Calculadora P = new Ejercicio1_Calculadora(a, b);
		System.out.println(P.Suma(a, b));
		System.out.println(P.Resta(a, b));
		System.out.println(P.Multiplicacion(a, b));
		System.out.println(P.Modulo(a, b));
		
		
		LecContrasena Con = new LecContrasena("1234");
		Con.detectContrasena();
	}

}
