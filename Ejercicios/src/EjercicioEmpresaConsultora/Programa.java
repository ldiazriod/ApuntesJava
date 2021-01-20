package EjercicioEmpresaConsultora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Programa {

	public static void main(String[] args) {
		
		Empresa consultora = new Empresa("www.technium.es");
		 consultora.altaEmpleado(new Auxiliar("1", "Jaime", "González",
		 LocalDate.parse("14-09-2017",
		 DateTimeFormatter.ofPattern("dd-MM-yyyy")), 18000.0));
		 consultora.altaEmpleado(new Tecnico("2", "Alicia", "Martín",
		 LocalDate.parse("10-01-2016",
		 DateTimeFormatter.ofPattern("dd-MM-yyyy")), 25000.0));
		 consultora.altaEmpleado(new Ingeniero("3", "Miriam", "Reyes",
		 LocalDate.parse("06-06-2018",
		 DateTimeFormatter.ofPattern("dd-MM-yyyy")), 28000.0, true));
		 consultora.altaEmpleado(new Ingeniero("4", "Laura", "Regadío",
		 LocalDate.parse("01-09-2013",
		 DateTimeFormatter.ofPattern("dd-MM-yyyy")), 30000.0, true));
		 consultora.altaEmpleado(new Ingeniero("5", "Pedro", "Salado",
		 LocalDate.parse("11-11-2011",
		 DateTimeFormatter.ofPattern("dd-MM-yyyy")), 30000.0, false));
		 consultora.altaEmpleado(new Tecnico("6", "Luis", "Sánchez",
		 LocalDate.parse("05-05-2018",
		 DateTimeFormatter.ofPattern("dd-MM-yyyy")), 24000.0));
		 consultora.altaEmpleado(new Auxiliar("7", "Alberto", "Gómez",
		 LocalDate.parse("14-02-2016",
		 DateTimeFormatter.ofPattern("dd-MM-yyyy")), 19000.0));
		 System.out.println(consultora.consultaEmpleados());
		 System.out.println(consultora.consultaEmpleados(18000, 28000));

		 System.out.println(consultora.consultaEmpleados("Auxiliar"));
		 System.out.println(consultora.consultaEmpleados("Tecnico"));
		 System.out.println(consultora.consultaEmpleados("Ingeniero"));

	}

}
