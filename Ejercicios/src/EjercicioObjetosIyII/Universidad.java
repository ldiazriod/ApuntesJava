package EjercicioObjetosIyII;

import java.util.Vector;

public class Universidad {
	
	private String web;
	private Vector<Persona> personas;
	
	public Universidad(String web) {
		this.web = web;
		this.personas = new Vector<Persona>();
	}
	
	public String getWeb() {
		return this.web;
	}
	
	public void altaPersona(Persona P) {
		this.personas.add(P);
	}
	
	public String consultaPersonas() {
		String s = this.getWeb() + "\t\t Profesores y Alumnos \n";
		
		for(Persona p : personas) {
			s += "\n" + p.getDatos(); 
		}
		
		s += "\n";
		return s;
	}
	
	public String consultaPersonas(String tipo) {
		String s = this.getWeb() + "\t\t\t " + tipo + "\n";
		
		for(Persona p : this.personas) {
			if(p.getClass().getSimpleName().equals(tipo)) {
				s += "\n" + p.getDatos();
			}
		}
		
		s += "\n";
		return s;
	}
	
}
