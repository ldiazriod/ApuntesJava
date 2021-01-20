package EjercicioPatronFlyWeight;

import java.util.HashMap;

public class LapizFactory {

	private static final HashMap<String, Lapiz> lapices = new HashMap<>();
	
	public static Lapiz getLapizFino(ColorLapiz color) {
		String idLapiz = color + " Fino";
		
		Lapiz lapiz = lapices.get(idLapiz);
		
		if(lapiz != null) {
			return lapiz;
		}else {
			lapiz = new LapizFino();
			lapiz.setColor(color);
			lapices.put(idLapiz, lapiz);
		}
		return lapiz;
	}
	
	public static Lapiz getLapizMedio(ColorLapiz color) {
		String idLapiz = color + " Medio";
		
		Lapiz lapiz = lapices.get(idLapiz);
		
		if(lapiz != null) {
			return lapiz;
		}else {
			lapiz = new LapizMedio();
			lapiz.setColor(color);
			lapices.put(idLapiz, lapiz);
		}
		return lapiz;
	}
	
	public static Lapiz getLapizGrueso(ColorLapiz color) {
		String idLapiz = color + " Grueso";
		
		Lapiz lapiz = lapices.get(idLapiz);
		
		if(lapiz != null) {
			return lapiz;
		}else {
			lapiz = new LapizGrueso();
			lapiz.setColor(color);
			lapices.put(idLapiz, lapiz);
		}
		return lapiz;
	}
}
