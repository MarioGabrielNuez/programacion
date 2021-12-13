import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez alcázar de Velasco
 *
 */
public class EjercicioOcho {
	static Scanner inp = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Calcular la Hipotenusa");
		System.out.println("**********************");
		
		System.out.print("Primer cateto: ");
		int CatA = inp.nextInt();
		
		System.out.print("Segundo cateto: ");
		int CatB = inp.nextInt();
		
		System.out.print("La hipotenusa resultante es: " + (Math.sqrt(Math.pow(CatA, 2) + Math.pow(CatB, 2))));
	}
	
}