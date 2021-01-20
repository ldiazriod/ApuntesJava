package EjercicioPatronFlyWeight;

public class LapizMedio implements Lapiz {
	
	final GrosorLapiz grosor = GrosorLapiz.MEDIO;
	private ColorLapiz color = null;
	
	public void setColor(ColorLapiz color) {
		this.color = color;
	}
	
	public void escribe(String texto) {
		System.out.println("Escribiendo con el lapiz medio " + color + ": " + texto);
	}
	
}
