import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class EjercicioUno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Escribe el primer n�mero: ");
		int N1 = inp.nextInt();
		
		System.out.print("Escribe el Segundo n�mero: ");
		int N2 = inp.nextInt();

		System.out.println("la suma " + N1 + " + " + N2 + " = " + (N1 + N2));
	}
}