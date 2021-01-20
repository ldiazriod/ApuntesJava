import java.util.Scanner;
public class LecContrasena {
	private String miContrasena;
	
	public LecContrasena(String ContrasenaGuardada){
		setMiContrasena(ContrasenaGuardada);
	}
	
	public void detectContrasena(){
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		boolean stop = false;
		while(counter != 3 || stop != true){
			System.out.print("Meta la contraseña: ");
			String newContrasena = scanner.nextLine();
			if(newContrasena.contentEquals(miContrasena)){
				System.out.println("Enhorabuena!");
				stop = true;
			}else{
				System.out.print("La contraseña no es correcta, metela de nuevo: ");
				String newContrasena1 = scanner.nextLine();
				counter++;
				if(newContrasena1.contentEquals(miContrasena)){
					System.out.println("Enhorabuena!");
					stop = true;
				}else {
					System.out.print("La contraseña no es correcta, metela de nuevo: ");
					String newContrasena2 = scanner.nextLine();
					counter++;
					if(newContrasena2.contentEquals(miContrasena)){
						System.out.println("Enhorabuena!");
						stop = true;
					}else {
						counter++;
					}
				}
			}
		}
		if(counter == 3){
			System.out.println("Se han acabado los intentos");
		}
	}

	public String getMiContrasena() {
		return miContrasena;
	}

	public void setMiContrasena(String miContrasena) {
		this.miContrasena = miContrasena;
	}
}
