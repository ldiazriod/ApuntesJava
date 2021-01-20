package EjercicioPatronFlyWeight;

public class LapizFino implements Lapiz{
	
	final GrosorLapiz grosor = GrosorLapiz.FINO;
	private ColorLapiz color = null;
	
	public void setColor(ColorLapiz color) {
		this.color = color;
	}
	
	public void escribe(String texto) {
		System.out.println("Escribiendo con el lapiz fino " + color + ": " + texto);
	}
	
}
