package Interfaz_Grafica_Swing;

import javax.swing.JOptionPane;

public class EntradaSalidaSwing {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			String nombre = JOptionPane.showInputDialog("�C�mo te llamas?");
			
			String numero = JOptionPane.showInputDialog("�Cu�l es tu n�mero favorito?");
			
			JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", �tu n�mero favorito es el " + numero + "!");
			
			opcion = JOptionPane.showConfirmDialog(null, "�Quieres continuar?", "Swing", JOptionPane.YES_NO_OPTION);
		}while(opcion == JOptionPane.YES_OPTION);

	}

}
