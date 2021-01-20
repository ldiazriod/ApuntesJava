package EjercicioPatronFlyWeight;

public class LapizGrueso implements Lapiz {
	
	final GrosorLapiz grosor = GrosorLapiz.GRUESO;
	private ColorLapiz color = null;
	 
	public void setColor(ColorLapiz color) {
		this.color = color;
	}
	 
	@Override
	public void escribe(String texto) {
		System.out.println("Escribiendo con el lapiz grueso " + color + ": " + texto);
	}
}
