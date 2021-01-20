package Genericos1;

public class UsoTiposConMetodosGenericos {

	public static void main(String[] args) {
		
		TipoGenerico<Integer> i1 = new TipoGenerico<Integer>(10);
		TipoGenerico<Integer> i2 = new TipoGenerico<Integer>(20);
		 
		System.out.println("Valor de i1 " + i1.getValor()); 
		System.out.println("Valor de i2 " + i2.getValor());
		
		TipoGenerico<Float> f1 = new TipoGenerico<Float>(10.25f);
		TipoGenerico<Float> f2 = new TipoGenerico<Float>(10.25f);
		 
		System.out.println("Valor de f1 " + f1.getValor());
		System.out.println("Valor de f2 " + f2.getValor());
		
		TipoGenerico<String> s1 = new TipoGenerico<String>("Java");
		TipoGenerico<String> s2 = new TipoGenerico<String>("C#");
		 
		System.out.println("i1, i2 " + ((i1.esIgual(i2)) ? "son iguales" : "son diferentes"));
		System.out.println("f1, f2 " + ((f1.esIgual(f2)) ? "son iguales" : "son diferentes"));
		System.out.println("s1, s2 " + ((s1.esIgual(s2)) ? "son iguales" : "son diferentes"));
	}

}
