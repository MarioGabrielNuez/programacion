import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez alcázar de Velasco
 *
 */
public class EjercicioUno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Introduce un Número: ");
		int N = inp.nextInt();
		
		if (N > 0) {
			System.out.println("El Número introducido es Positivo");
		} else {
			System.out.println("El Número introducido es Negativo");
		}

	}

}
