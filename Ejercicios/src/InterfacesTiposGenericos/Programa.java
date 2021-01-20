package InterfacesTiposGenericos;

public class Programa {

	public static void main(String[] args) {
		 Buffer<String> palabras = new Buffer<String>(10);
		 
		 String [] lenguajes = {"Pascal", "C", "C++", "Python", "Java", "Ruby", "Ada", "Lisp", "php", "perl", "Javascript", "Logo"};
		 
		 for (int i=0; i<lenguajes.length; i++) {
			 palabras.inserta(lenguajes[i]);
		 }
		 
		 System.out.println("hola");
			 
		 if (!palabras.vacio()) {
			 int p = palabras.inicio();
			 int u = palabras.fin();
			 String palabra;
			 do {
			 try {
			 palabra = palabras.elemento(p);
			 System.out.println(palabra);
			 p = palabras.sucesor(p);
			 } catch (Exception e) {
			 System.out.println(e.getMessage());
			 }
			 } while (p != palabras.sucesor(u));
			 }

	}

}
