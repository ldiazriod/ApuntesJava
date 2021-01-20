package Genericos1;

public class UsosTiposGenericos {

	public static void main(String[] args) {
		
		TipoGenerico<Integer> i1 = new TipoGenerico<Integer>(10);
		TipoGenerico<Integer> i2 = new TipoGenerico<Integer>(20);
		
		System.out.println("Valor de i1 " + i1.getValor());
		System.out.println("Valor de i2 " + i2.getValor());
		
		i2.setValor(25);
		
		System.out.println("Valor de i2 " + i2.getValor());
		
		TipoGenerico<Float> f1 = new TipoGenerico<Float>(10.25f);
		TipoGenerico<Float> f2 = new TipoGenerico<Float>(0.25f);
		
		System.out.println("Valor de f1 " + f1.getValor());
		System.out.println("Valor de f2 " + f2.getValor());
		
		TipoGenerico<String> s = new TipoGenerico<String>("String");
		
		System.out.println("Valor de s " + s.getValor());

	}

}
