package EjercicioPatronCommand;

public class Programa {

	public static void main(String[] args) {
		
		Calefaccion electrica = new Calefaccion("Electrica");
		Calefaccion gas = new Calefaccion("Gas");
		 
		MandoDistancia mando = new MandoDistancia();
		 
		mando.comando(new CalefaccionEncender(electrica));
		mando.ejecuta();
		 
		mando.comando(new CalefaccionEncender(gas));
		mando.ejecuta();
		 
		mando.comando(new CalefaccionApagar(electrica));
		mando.ejecuta();
		 
		mando.comando(new CalefaccionApagar(gas));
		mando.ejecuta();

	}

}
