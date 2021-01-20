package EjercicioEntidadBancaria;

public class Programa {

	public static void main(String[] args) {
		Banco bbva = new Banco("www.bbva.com", "2550", "BBVA");
		 bbva.altaCliente( new Cliente("45238745B", "Luis", "Martin","654025366"));
		 bbva.altaCliente( new Cliente("55746198M", "Jaime", "Ruiz","600003487"));
		 bbva.altaCliente( new Cliente("31728917K", "Maria", "Gomez","605095357"));
		 bbva.altaCuenta( new CuentaJoven("1010000001", 100,"45238745B"));
		 bbva.altaCuenta( new CuentaProfesional("2020000005", 200,"55746198M"));
		 bbva.altaCuenta( new CuentaPensionista("3030000010", 150,"31728917K"));
		 
		 System.out.println(bbva.consultaCuentas());
		 bbva.ingresoCuenta("1010000001", 200);
		 bbva.ingresoCuenta("2020000005", 50);
		 bbva.ingresoCuenta("3030000010", 350);
		 System.out.println(bbva.consultaCuentas());

	}

}
