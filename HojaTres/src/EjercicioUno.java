import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel N��ez alc�zar de Velasco
 *
 */
public class EjercicioUno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Introduce un N�mero: ");
		int N = inp.nextInt();
		
		if (N > 0) {
			System.out.println("El N�mero introducido es Positivo");
		} else {
			System.out.println("El N�mero introducido es Negativo");
		}

	}

}
