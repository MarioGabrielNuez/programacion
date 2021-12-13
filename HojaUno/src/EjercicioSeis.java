import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioSeis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int N1 = inp.nextInt();
		
		System.out.print("Introduce el primer numero: ");
		int N2 = inp.nextInt();
		
		if (N2 == 0) {
			System.out.println("Error: no se puede dividir entre 0");
		} else {
			System.out.println(N1 + " / " + N2 + " = " + (N1 / N2));
		}

	}

}