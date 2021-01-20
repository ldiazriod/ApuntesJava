package InterfacesPromedioMaxMin;

public class PromedioMinimoMaximoArray implements IPromedioMinimoMaximo {
	
	private int [] datos;
	
	public PromedioMinimoMaximoArray(int [] datos) {
		this.datos = datos;
	}
	
	public double promedioMinimoMaximo() {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		for(int n: this.datos) {
			if(min > n) {
				min = n;
			}
			
			if(max < n) {
				max = n;
			}
		}
		return (min + max)/ 2.0;
	}
	
}
