import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velascp
 *
 */
public class Factorial {
	private static Scanner inp = new Scanner (System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Calculo del Factorial");
		System.out.println("**************************************************************");
		System.out.print("Introduce un Número: ");
		long num = inp.nextLong();
		
		if (num < 0) {
			System.out.println("Entrada no valida");
		} else {
			System.out.print("Su Factorial es: " + calc(num));
		}
	}
	
	private static long calc(long op) {
		long res = 0;
		if (op == 2) {
			res = 2;
		} else if (op <= 1){
			res = 1;
		} else {
			res = op * calc(op - 1);
		}
		return res;
	}

}
