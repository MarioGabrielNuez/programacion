import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez alcázar de Velasco
 *
 */
public class EjercicioOcho {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int N = inp.nextInt(); 
		
		for(byte i = 0; i <= 10;i++){
			System.out.println(N + " * " + i + " = " + (N * i));
		}

	}
	
}