import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioUno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Escribe el primer número: ");
		int N1 = inp.nextInt();
		
		System.out.print("Escribe el Segundo número: ");
		int N2 = inp.nextInt();

		System.out.println("la suma " + N1 + " + " + N2 + " = " + (N1 + N2));
	}
}