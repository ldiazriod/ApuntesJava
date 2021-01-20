package Interfaz_Grafica_Swing;

import javax.swing.JOptionPane;

public class EntradaSalidaSwing {

	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
			
			String numero = JOptionPane.showInputDialog("¿Cuál es tu número favorito?");
			
			JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", ¡tu número favorito es el " + numero + "!");
			
			opcion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Swing", JOptionPane.YES_NO_OPTION);
		}while(opcion == JOptionPane.YES_OPTION);

	}

}
