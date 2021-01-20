package EjercicioObjetosIyII;

import java.util.Calendar;

public abstract class Persona {
	
	private String DNI;
	private String nombre;
	private String apellidos;
	private String telefono;
	private int diaNacimiento;
	private int mesNacimiento;
	private int anoNacimiento;
	
	public Persona(String DNI, String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anoNacimiento) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.anoNacimiento = anoNacimiento;
	}
	
	public Persona(String DNI, String nombre, String apellidos, String telefono, int diaNacimiento, int mesNacimiento, int anoNacimiento) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.anoNacimiento = anoNacimiento;
		this.telefono = telefono;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public String getDatos() {
		return this.getDNI() + " " +
				 this.getNombre() + " " + this.getApellidos() + "\t" +
				 this.telefono + " " + this.getEdad() + " años";	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public int getDiaNacimiento() {
		return this.diaNacimiento;
	}
	
	public int getMesNacimiento() {
		return this.mesNacimiento;
	}
	
	public int getAnoNacimiento() {
		return this.anoNacimiento;
	}
	
	public int getEdad() {
		return calcularEdad(this.diaNacimiento, this.mesNacimiento, this.anoNacimiento);
	}
	
	
	public static int calcularEdad(int diaNacimiento, int mesNacimiento, int anoNacimiento) {
		int diaHoy, mesHoy, anoHoy, edad;
		
		diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		mesHoy = Calendar.getInstance().get(Calendar.MONTH) + 1;
		anoHoy = Calendar.getInstance().get(Calendar.YEAR);
		
		if((mesHoy > mesNacimiento) || ((mesHoy == mesNacimiento) && (diaHoy >= diaNacimiento))) {
			edad = anoHoy - anoNacimiento;
		}else {
			edad = anoHoy - anoNacimiento - 1;
		}
		
		return edad;
		
	}

}
