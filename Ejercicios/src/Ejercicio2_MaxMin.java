
public class Ejercicio2_MaxMin {

	public Ejercicio2_MaxMin(double a, double b){}
	
	public double MaxMin(double a, double b){
		double aux = 0;
		if(a > b){
			aux = a;
		}else if(a < b) {
			aux = b;
		}else {
			System.out.println("Son iguales");
		}
		return aux;
	}
}
