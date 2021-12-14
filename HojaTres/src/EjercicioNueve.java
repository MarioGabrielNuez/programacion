import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Núñez Alcázar de Velasco
 *
 */
public class EjercicioNueve {
	static Scanner inp = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Area de un cilindro");
		System.out.println("**************************");
		
		System.out.print("Radio: ");
		int r = inp.nextInt();
		
		System.out.print("Altura: ");
		int h = inp.nextInt();
		
		System.out.println("El Area Resultante es: " + ((2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r,2))));
	}

}
