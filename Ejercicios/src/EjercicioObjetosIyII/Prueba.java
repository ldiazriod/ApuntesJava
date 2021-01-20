package EjercicioObjetosIyII;

public class Prueba {

	public static void main(String[] args) {
		
		Universidad nebrija = new Universidad("nebrija.com");
		 nebrija.altaPersona(new Profesor("45318921V", "Juan",
		 "Martin Lopez", "654025366", 2, 5, 1972, 2000));
		 nebrija.altaPersona(new Profesor("45289177M", "Mario",
		 "Lara Gomez", "600030483", 10, 11, 1977, 1999));
		 nebrija.altaPersona(new Profesor("46291264X", "Laura",
		 "Rios Valle", "615045753", 5, 3, 1978, 2008));
		 
		 nebrija.altaPersona(new Alumno("51927663H", "Belen",
		 "Llano Gamez", "605125559", "INF", 5, 10, 2000));
		 nebrija.altaPersona(new Alumno("52879130M", "Jesus",
		 "Perez Lopez", "675029788", "IND", 12, 9, 2001));
		 nebrija.altaPersona(new Alumno("52189335N", "Luisa",
		 "Salas Rojo", "655157659", "INF", 14, 4, 2001));
		 
		 System.out.println(nebrija.consultaPersonas());
		 System.out.println(nebrija.consultaPersonas("Alumno"));
		 System.out.println(nebrija.consultaPersonas("Profesor"));

	}

}
