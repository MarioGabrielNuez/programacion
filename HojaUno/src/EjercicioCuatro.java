import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioCuatro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Num = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int N1 = Num.nextInt();
		
		if ((N1 % 2) == 0) {
			System.out.println("El numero introducido es par");
			
		} else {
			System.out.println("El numero introducido es impar");
		}

	}

}
