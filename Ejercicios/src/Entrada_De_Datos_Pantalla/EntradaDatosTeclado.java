package Entrada_De_Datos_Pantalla;

import java.util.Scanner;

public class EntradaDatosTeclado {

	public static void main(String[] args) {
		
		String nombre;
		int diaNacimiento, mesNacimiento, anoNacimiento;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("�Como te llamas?	");
		nombre = entradaTeclado.nextLine();
		
		System.out.println("�Qu� d�a naciste?   ");
		diaNacimiento = entradaTeclado.nextInt();
		
		System.out.print("�En qu� mes? ");
		 mesNacimiento = entradaTeclado.nextInt();
		 
		System.out.print("�En qu� a�o? ");
		anoNacimiento = entradaTeclado.nextInt();
		 
		System.out.println("Hola " + nombre + ", naciste el " + diaNacimiento + "/" + mesNacimiento + "/" +anoNacimiento);
		entradaTeclado.close();


	}

}
