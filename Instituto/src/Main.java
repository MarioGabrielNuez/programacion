import java.util.*;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Main {
	static public Scanner inp = new Scanner(System.in);
	static public boolean err = false;
	
	/**
	 * Funcion principal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno();
		System.out.print("Nombre del alumno: ");
		alumno1.setNombre(inp.next());
		
		try {
			System.out.println("edad del alumno");
			alumno1.setEdad(inp.nextInt());
		} catch (Exception e) {
			System.out.println("error: La edad debe ser númerica; " + e);
		} finally {
			System.out.println("Nombre: " + alumno1.getNombre());
			System.out.println("Edad: " + alumno1.getEdad());
		}
		
		Alumno alumno2 = new Alumno("Zutanito");
		System.out.println(alumno2);
	}
}
